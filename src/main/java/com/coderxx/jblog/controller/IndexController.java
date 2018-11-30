package com.coderxx.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class IndexController {

    @RequestMapping("/")
//    @GetMapping("/hello/{id}")
    public String index() {
//        return "Hello World!";
        return "/index";
    }

}
