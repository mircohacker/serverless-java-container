package com.amazonaws.serverless.sample.springboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    public IndexController() {
    }

    @GetMapping("/index")
    public String something2() {
        return "index";
    }
}
