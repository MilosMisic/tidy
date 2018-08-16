package com.home.tidy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/ping")
    public String pingTest() {
        return "OK";
    }

    @RequestMapping("/")
    public String home() {
        return "index.html";
    }

}
