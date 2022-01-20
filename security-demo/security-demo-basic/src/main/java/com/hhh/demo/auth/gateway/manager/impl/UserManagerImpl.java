package com.hhh.demo.auth.gateway.manager.impl;

import com.hhh.demo.auth.gateway.entity.User;
import com.hhh.demo.auth.gateway.manager.UserManager;
import com.hhh.demo.auth.gateway.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Date: 2022-01-17 23:56
 * @Author: persistman
 * @Description: User 数据访问层管理
 **/
@Component
public class UserManagerImpl implements UserManager {

    @Resource
    private UserRepository userRepository;

    @Override
    public User findUserByName(String name) {
        return userRepository.findUserByUsername(name);
    }

    @Override
    public User findUserById(long userId) {
        return userRepository.getById(userId);
    }
}
