package com.cheng.springboothalo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaloController {
    @GetMapping(value = "/halo")
    public String halo() {
        return "Halo Spring Boot!";
    }
}
