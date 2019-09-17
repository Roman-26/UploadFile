package com.alexcompany.springvalidation59.repository;

import com.alexcompany.springvalidation59.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CustomUserRepositoryImplement implements CustomUserRepository {

    @Autowired
    private EntityManager entityManager;

    // SQL - "SELECT * FROM User WHERE Phone like %p OR Email like %e"
    // HQL - "from User where User.Phone = "%p" or User.Email = "%e"
    // JPQL - "SELECT u FROM User u WHERE u.Phone = :p or u.Email = :p"
    @Override
    public List<User> findAllByPhoneOrEmail(String phone, String email) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);

        Root<User> user = cq.from(User.class);
        Predicate phonePredicate = cb.equal(user.get("phone"), phone);
        Predicate emailPredicate = cb.equal(user.get("email"), email);
        Predicate phoneOrEmail = cb.or(phonePredicate, emailPredicate);

        cq.where(phoneOrEmail);

        TypedQuery<User> userTypedQuery = entityManager.createQuery(cq);
        return userTypedQuery.getResultList();
    }
}
