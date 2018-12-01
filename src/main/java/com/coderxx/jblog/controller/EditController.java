package com.coderxx.jblog.controller;

import com.coderxx.jblog.entity.Article;
import com.coderxx.jblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") int id) {
        Article article = articleService.selectById(id);
        model.addAttribute("article", article);
        return "/insert";
    }
}
