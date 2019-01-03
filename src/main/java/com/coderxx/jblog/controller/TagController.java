package com.coderxx.jblog.controller;

import com.coderxx.jblog.entity.Tag;
import com.coderxx.jblog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @RequestMapping(method = RequestMethod.POST, value = "/insert")
    public Tag insert(Tag tag) {
        tagService.insert(tag);
        return tag;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        tagService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update/{id}")
    public void update(@PathVariable("id") Integer id,
                       @RequestParam("title") String title){
        Tag tag = new Tag();
        tag.setId(id);
        tag.setTitle(title);

        tagService.update(tag);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/select")
    public Tag select(@PathVariable("id") int id) {
        return tagService.selectById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/selectAll")
    public List<Tag> selectAll(){
        return tagService.selectAll();
    }
}
