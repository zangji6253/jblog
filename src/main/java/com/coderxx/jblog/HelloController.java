package com.coderxx.jblog;

import com.coderxx.jblog.property.CrossProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private CrossProperty crossProperty;

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") Integer id) {
        return ", id = " + id + crossProperty.getOrigin();
    }
}
