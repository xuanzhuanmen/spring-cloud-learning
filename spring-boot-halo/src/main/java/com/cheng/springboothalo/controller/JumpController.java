package com.cheng.springboothalo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

    @RequestMapping("/jump2Douban")
    public String jump2Douban() {
        return "redirect:https://www.douban.com/";
    }

    @RequestMapping("/jump2Xueqiu")
    public String jump2Xueqiu() {
        return "redirect:https://www.xueqiu.com";
    }
}
