package com.coderxx.jblog.controller;

import com.coderxx.jblog.entity.Article;
import com.coderxx.jblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
//    @GetMapping("/hello/{id}")
    public String index(Model model) {
        List<Article> articles = articleService.selectAll();

        Article article = articleService.selectById(1);
//        if(article.toString() == ''){
            model.addAttribute("articles", articles);
            model.addAttribute("article", article);
//        }
        return "/index";
//        return "forward:/article/1/select";
    }

    @GetMapping("/{id}")
    public String atricle(Model model,@PathVariable("id") int id) {
        List<Article> articles = articleService.selectAll();
        Article article = articleService.selectById(id);
        model.addAttribute("articles", articles);
        model.addAttribute("article", article);
        return "/index";
    }

}
