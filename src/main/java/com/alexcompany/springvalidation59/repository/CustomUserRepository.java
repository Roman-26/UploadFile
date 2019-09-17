package com.alexcompany.springvalidation59.repository;

import com.alexcompany.springvalidation59.model.User;

import java.util.List;

public interface CustomUserRepository {

    List<User> findAllByPhoneOrEmail(String phone, String email);
}
