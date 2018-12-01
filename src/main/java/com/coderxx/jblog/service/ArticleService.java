package com.coderxx.jblog.service;

import com.coderxx.jblog.entity.Article;

import java.util.Iterator;
import java.util.List;

public interface ArticleService {
    /**
     * 删除
     */
    public void delete(int id);

    /**
     * 增加
     */
    public void insert(Article user);

    /**
     * 更新
     */
    public int update(Article user);

    /**
     * 查询单个
     */
    public Article selectById(int id);

    /**
     * 查询全部列表
     */
//    public Iterator<Article> selectAll(int pageNum, int pageSize);
    public List<Article> selectAll();

}
