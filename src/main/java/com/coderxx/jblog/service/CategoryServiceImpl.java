package com.coderxx.jblog.service;

import com.coderxx.jblog.entity.Category;
import com.coderxx.jblog.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * 删除 * * @param id
     */
    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }

    /**
     * 增加 * * @param user
     */
    @Override
    public Category insert(Category category) {
        return categoryRepository.save(category);
    }

    /**
     * 更新 * * @param user
     */
    @Override
    public int update(Category category) {
        categoryRepository.save(category);
        return 1;
    }

    /**
     * 查询单个 * * @param id
     */
    @Override
    public Category selectById(int id) {
        Optional<Category> optional = categoryRepository.findById(id);
        Category category = optional.get();
        return category;
    }

    /**
     * 查询子分类
     */
    public List<Category> selectChildrenFromFid(int fid){
        //创建查询条件数据对象
        Category category = new Category();
        category.setFid(fid);
//        category.setFocus(true);

        //创建实例
        Example<Category> ex = Example.of(category);

        return categoryRepository.findAll(ex);
    }

    public List<Category> selectAll() {
        return categoryRepository.findAll();
    }
}
