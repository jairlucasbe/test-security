package com.example.security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("v1")
public class CustomerController {

    @GetMapping("/index")
    public String index(){
        return "hello world";
    }

    @GetMapping("/index2")
    public String notSecure(){
        return "hello world not secure";
    }

}
