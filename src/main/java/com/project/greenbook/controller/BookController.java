package com.project.greenbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
