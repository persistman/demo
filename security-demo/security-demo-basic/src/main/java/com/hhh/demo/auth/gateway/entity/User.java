package com.hhh.demo.auth.gateway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Date: 2022-01-16 0:45
 * @Author: persistman
 * @Description: User Entity
 **/
@Data
@Table( indexes = {
        @Index(name = "idx_email", columnList = "email"),
        @Index(name = "idx_phone", columnList = "phone")
})
@Entity(name = "t_system_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String userKey;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email = "";

    @Column(nullable = false)
    private String phone = "";

    private String registTime;

    @Column(nullable = false)
    private boolean enabled = true;

    @Column(nullable = false)
    private boolean locked = false;

    private Date createTime = new Date();

    private Date updateTime = new Date();
}
