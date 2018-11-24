package com.cheng.springboothalo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/getUserName")
    public String getUserName() {
        return "Halo Stranger!";
    }

    @RequestMapping("/addUser")
    public void addUser(int i) {

    }

    @RequestMapping("/deleteUser")
    public void deleteUser() {

    }
}
