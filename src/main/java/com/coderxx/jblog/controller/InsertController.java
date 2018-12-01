package com.coderxx.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {
    @RequestMapping("/insert")
    public String index() {
        return "/insert";
    }
}
