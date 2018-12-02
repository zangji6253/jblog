package com.coderxx.jblog.controller;

import com.coderxx.jblog.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {
    @RequestMapping("/insert")
    public String index(Model model) {
        Article article = new Article();
        model.addAttribute("article", article);
        return "/insert";
    }
}
