package com.richyyin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloWorld {

    @RequestMapping("/index")
    public String getUserName() {
        return "index";
    }

    public static void main (String[] args) {
        System.out.println("Hello World");
    }
}
