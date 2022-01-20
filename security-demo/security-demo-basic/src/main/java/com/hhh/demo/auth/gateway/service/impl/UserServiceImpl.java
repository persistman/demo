package com.hhh.demo.auth.gateway.service.impl;

import com.hhh.demo.auth.gateway.entity.User;
import com.hhh.demo.auth.gateway.manager.UserManager;
import com.hhh.demo.auth.gateway.security.UserDetailImpl;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Date: 2022-01-16 0:33
 * @Author: persistman
 * @Description: 实现自定义用户管理
 **/
@Service
public class UserServiceImpl implements UserDetailsService {

    @Resource
    private UserManager userManager;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userManager.findUserByName(username);

        return new UserDetailImpl(user, AuthorityUtils.commaSeparatedStringToAuthorityList("admin, normal"));
    }
}
