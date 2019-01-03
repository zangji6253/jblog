package com.coderxx.jblog.controller;

import com.coderxx.jblog.entity.ArticleTag;
import com.coderxx.jblog.service.ArticleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articleTag")
public class ArticleTagController {
    @Autowired
    private ArticleTagService articleTagService;

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        articleTagService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/insert")
    public ArticleTag insert(ArticleTag articleTag) {
        articleTagService.insert(articleTag);
        return articleTag;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update/{id}")
    public void update(@PathVariable("id") Integer id,
                       @RequestParam("tag_id") Integer tagId,
                       @RequestParam("article_id") Integer articleId) {
        ArticleTag articleTag = new ArticleTag();
        articleTag.setId(id);
        articleTag.setTag_id(tagId);
        articleTag.setArticle_id(articleId);

        articleTagService.update(articleTag);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{id}/select")
    public ArticleTag select(@PathVariable("id") int id) {
        return articleTagService.selectById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/selectAll")
    public List<ArticleTag> selectAll() {
        return articleTagService.selectAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/selectByTagId/{tid}")
    public List<ArticleTag> selectByTagId(@PathVariable("tid") int tid) {
        return articleTagService.selectByTagId(tid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/selectByArticleId/{aid}")
    public List<ArticleTag> selectByArticleId(@PathVariable("aid") int aid) {
        return articleTagService.selectByArticleId(aid);
    }
}
