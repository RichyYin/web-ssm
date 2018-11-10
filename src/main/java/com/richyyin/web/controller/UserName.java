package com.richyyin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class UserName {

    @RequestMapping("/username")
    public String getUserName() {
        return "username";
    }

    public static void main (String[] args) {
        System.out.println("Hello World");
    }
}
