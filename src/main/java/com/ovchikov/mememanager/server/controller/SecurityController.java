package com.ovchikov.mememanager.server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("security")
@CrossOrigin
public class SecurityController {

    // test security
    @GetMapping("/hello")
    public String helloUser(){
        return "hello, user!";
    }

}
