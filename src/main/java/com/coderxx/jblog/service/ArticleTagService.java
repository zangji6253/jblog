package com.coderxx.jblog.service;

import com.coderxx.jblog.entity.ArticleTag;

import java.util.List;

public interface ArticleTagService {
    /**
     * 删除
     */
    public void delete(int id);

    /**
     * 增加
     */
    public ArticleTag insert(ArticleTag articleTag);

    /**
     * 更新
     */
    public int update(ArticleTag articleTag);

    /**
     * 查询单个
     */
    public ArticleTag selectById(int id);

    /**
     * 查询全部列表
     */
    public List<ArticleTag> selectAll();

    /**
     * 按标签编号查询列表
     */
    public List<ArticleTag> selectByTagId(int tagId);

    /**
     * 按文章编号查询列表
     */
    public List<ArticleTag> selectByArticleId(int articleId);
}
