package com.alexcompany.springvalidation59.repository;

import com.alexcompany.springvalidation59.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository {


}
