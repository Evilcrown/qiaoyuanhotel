package com.qiaoyuanhotel.hotelshop.controller;

import com.qiaoyuanhotel.hotelshop.modal.User;
import com.qiaoyuanhotel.hotelshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "index";
    }

    @RequestMapping("/selectUser")
    @ResponseBody
    public User getUserById(){
        return userService.findUserById(1);
    }
}
