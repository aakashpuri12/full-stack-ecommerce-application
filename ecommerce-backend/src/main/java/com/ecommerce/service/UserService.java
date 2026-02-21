package com.ecommerce.service;

import java.util.List;
import com.ecommerce.model.User;

public interface UserService {

    User registerUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);
}