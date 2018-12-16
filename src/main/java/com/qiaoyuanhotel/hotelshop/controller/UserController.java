package com.qiaoyuanhotel.hotelshop.controller;

import com.qiaoyuanhotel.hotelshop.modal.User;
import com.qiaoyuanhotel.hotelshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping("/cookieTest")
    public String cookieTest(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie = new Cookie("cookietest", "我是来自服务器端的cookie");
        response.addCookie(cookie);
        return "index";
    }
}
