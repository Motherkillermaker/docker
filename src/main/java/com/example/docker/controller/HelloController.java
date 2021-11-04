package com.example.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CJYong
 * @create 2021-11-03 10:00
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,jianyong";
    }
}
