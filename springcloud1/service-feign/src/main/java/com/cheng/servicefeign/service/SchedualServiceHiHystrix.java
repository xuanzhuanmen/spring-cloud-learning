package com.cheng.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "I have an error.Sorry " + name;
    }
}
