package com.hhh.demo.auth.gateway.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class Controller {

    @ResponseBody
    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Integer id) {
        return "{'id': #{id}, 'name': 'persitman'}";
    }

    @ResponseBody
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("pass") String password){

        return "{ \"username\": " + username + ", \"password\": " + password +"}";
    }
}
