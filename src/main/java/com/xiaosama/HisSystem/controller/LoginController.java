package com.xiaosama.HisSystem.controller;

import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/login")
    public DataWithStatus login(@RequestParam("username") String username,@RequestParam("password") String password){
        return loginService.login(username, password);
    }
}

