package com.hhh.demo.auth.oauth2.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

/**
 * @Date: 2022-01-09 23:40
 * @Author: persistman
 * @Description: TODO
 **/
@Configuration
@EnableGlobalAuthentication
public class AuthorizationConfiguration extends GlobalAuthenticationConfigurerAdapter {
}
