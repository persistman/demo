package com.hhh.demo.auth.gateway.repository;

import com.hhh.demo.auth.gateway.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);
}
