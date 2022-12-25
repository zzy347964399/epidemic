package com.example.shujuku.controller;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/user")
public class usercontroller {
    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;
    //login
    @PostMapping("login")
    public Result
}
