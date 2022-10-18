package com.ovchikov.mememanager.server.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("security")
@CrossOrigin
public class SecurityController {

    // test security
    @GetMapping("/hello")
    public String helloUser(){
        return "hello, user!";
    }

    //to test oauth
    @PostMapping("/test")
    public String test(HttpServletRequest request){
        String jsonString = request.getParameter("json");
        System.out.println(jsonString);

        return "Нормас, Серёга, всё получилось";
    }

}
