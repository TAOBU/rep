package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class springboot {
    @RequestMapping("/login")
    public String sayhello(){
        return "hello spring boot";
    }
}
