package com.coderxx.jblog.controller;

import com.coderxx.jblog.entity.Category;
import com.coderxx.jblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.POST, value = "/insert")
    public Category insert(Category category) {
        categoryService.insert(category);
        return category;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        categoryService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update/{id}")
    public void update(@PathVariable("id") Integer id,
                       @RequestParam("title") String title,
                       @RequestParam("fid") Integer fid){
        Category tag = new Category();
        tag.setId(id);
        tag.setTitle(title);
        tag.setFid(fid);

        categoryService.update(tag);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/select")
    public Category select(@PathVariable("id") int id) {
        return categoryService.selectById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/selectAll")
    public List<Category> selectAll(){
        return categoryService.selectAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/selectChildrenFromFid/{fid}")
    public List<Category> selectAllChildren(@PathVariable("fid") int fid){
        return categoryService.selectChildrenFromFid(fid);
    }
}
