package com.hhh.demo.auth.gateway.security;

import com.hhh.demo.auth.gateway.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * @Date: 2022-01-16 0:55
 * @Author: persistman
 * @Description: 自定义实现 UserDetails 的功能实现
 **/
public class UserDetailImpl implements UserDetails, Serializable {

    private static final long serialVersionUID = 1L;

    private User user;

    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailImpl(User user, Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !user.isLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return user.isEnabled();
    }
}
