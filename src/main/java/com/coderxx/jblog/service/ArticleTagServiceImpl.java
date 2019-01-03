package com.coderxx.jblog.service;

import com.coderxx.jblog.entity.ArticleTag;
import com.coderxx.jblog.repository.ArticleTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleTagServiceImpl implements ArticleTagService{
    @Autowired
    private ArticleTagRepository articleTagRepository;

    /**
     * 删除 * * @param id
     */
    @Override
    public void delete(int id) {
        articleTagRepository.deleteById(id);
    }

    /**
     * 增加 * * @param user
     */
    @Override
    public ArticleTag insert(ArticleTag articleTag) {
        return articleTagRepository.save(articleTag);
    }

    /**
     * 更新 * * @param user
     */
    @Override
    public int update(ArticleTag articleTag) {
        articleTagRepository.save(articleTag);
        return 1;
    }

    /**
     * 查询单个 * * @param id
     */
    @Override
    public ArticleTag selectById(int id) {
        Optional<ArticleTag> optional = articleTagRepository.findById(id);
        ArticleTag articleTag = optional.get();
        return articleTag;
    }

    public List<ArticleTag> selectAll() {
        return articleTagRepository.findAll();
    }

    /**
     * 按标签编号查询列表
     */
    public List<ArticleTag> selectByTagId(int tagId){
        ArticleTag articleTag = new ArticleTag();
        articleTag.setTag_id(tagId);
        Example<ArticleTag> ex = Example.of(articleTag);
        return articleTagRepository.findAll(ex);
    }

    /**
     * 按文章编号查询列表
     */
    public List<ArticleTag> selectByArticleId(int articleId){
        ArticleTag articleTag = new ArticleTag();
        articleTag.setArticle_id(articleId);
        Example<ArticleTag> ex = Example.of(articleTag);
        return articleTagRepository.findAll(ex);
    }
}
