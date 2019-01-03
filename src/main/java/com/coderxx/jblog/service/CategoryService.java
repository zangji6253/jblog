package com.coderxx.jblog.service;

import com.coderxx.jblog.entity.Category;

import java.util.List;

public interface CategoryService {
    /**
     * 删除
     */
    public void delete(int id);

    /**
     * 增加
     */
    public Category insert(Category category);

    /**
     * 更新
     */
    public int update(Category category);

    /**
     * 查询单个
     */
    public Category selectById(int id);

    /**
     * 查询子分类
     */
    public List<Category> selectChildrenFromFid(int fid);

    /**
     * 查询全部列表
     */
    public List<Category> selectAll();
}
