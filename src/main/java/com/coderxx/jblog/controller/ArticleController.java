package com.coderxx.jblog.controller;

import com.coderxx.jblog.entity.Article;
import com.coderxx.jblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/article")
//@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        articleService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/insert")
    public Article insert(Article article) {
        articleService.insert(article);
        writeToFile(article);
        return article;
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/update/{id}")
//    public void update(@RequestParam Article article) {
//        articleService.update(article);
//    }

    @RequestMapping(method = RequestMethod.POST, value = "/update/{id}")
    public void update(@PathVariable("id") Integer id,
                       @RequestParam("title") String title,
                       @RequestParam("content") String content,
                       @RequestParam("category_id") Integer categoryId) {
        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setContent(content);
        article.setCategory_id(categoryId);

        writeToFile(article);

        articleService.update(article);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{id}/select")
    public Article select(@PathVariable("id") int id) {
        return articleService.selectById(id);
    }

    //    @RequestMapping(method = RequestMethod.GET, value = "/selectAll/{pageNum}/{pageSize}")
//    public List<Article> selectAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
//        Iterator<User> userIterator = userService.selectAll(pageNum, pageSize);
//        List<User> list = new ArrayList<>();
//        while (userIterator.hasNext()) {
//            list.add(userIterator.next());
//        }
//        return list;
//    }
    @RequestMapping(method = RequestMethod.GET, value = "/selectAll")
    public List<Article> selectAll() {
        return articleService.selectAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/selectByCategoryId/{cid}")
    public List<Article> selectByCategoryId(@PathVariable("cid") int cid) {
        return articleService.selectByCategoryId(cid);
    }

    private void writeToFile(Article article) {
        try {
            File file = new File("blogs/" + article.getId() + ".md");

            //if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(file.getPath());

            fileWritter.write(article.getTitle() + "\n");
            fileWritter.write(article.getContent() + "\n");
            fileWritter.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

