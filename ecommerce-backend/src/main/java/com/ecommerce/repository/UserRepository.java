package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // custom query (later login ke liye useful)
    User findByEmail(String email);
}