package com.coderxx.jblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") Integer id) {
        return ", id = " + id;
    }
}
