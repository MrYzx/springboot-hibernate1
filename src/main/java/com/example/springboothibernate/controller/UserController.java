package com.example.springboothibernate.controller;

import com.example.springboothibernate.beans.User;
import com.example.springboothibernate.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com/yzx")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/test1")
    public String test1(User user){
        int code = userService.saveUser(user);
        if(code > 0 ){
            return "保存成功！";
        }
        return "保存失败！";
    }

}
