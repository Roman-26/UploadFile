package com.alexcompany.springvalidation59.service;

import com.alexcompany.springvalidation59.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    Page<User> findAll(Pageable pageable);
    List<User> findAllByPhoneOrEmail(String phone, String email);

}
