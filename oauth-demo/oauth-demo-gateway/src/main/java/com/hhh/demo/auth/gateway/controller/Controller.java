package com.hhh.demo.auth.gateway.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class Controller {

    @ResponseBody
    @GetMapping("/${id}")
    public String getUser(@PathVariable("id") Integer id) {
        return "{'id': ${id}, 'name': 'persitman'}";
    }
}
