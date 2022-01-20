package com.hhh.demo.auth.gateway.manager;

import com.hhh.demo.auth.gateway.entity.User;

public interface UserManager {

    User findUserByName(String name);

    User findUserById(long userId);
}
