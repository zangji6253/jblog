package com.coderxx.jblog.service;

import com.coderxx.jblog.entity.Article;
import com.coderxx.jblog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    /**
     * 删除 * * @param id
     */
    @Override
    public void delete(int id) {
        articleRepository.deleteById(id);
    }

    /**
     * 增加 * * @param user
     */
    @Override
    public Article insert(Article article) {
        return articleRepository.save(article);
    }

    /**
     * 更新 * * @param user
     */
    @Override
    public int update(Article article) {
        articleRepository.save(article);
        return 1;
    }

    /**
     * 查询单个 * * @param id
     */
    @Override
    public Article selectById(int id) {
        Optional<Article> optional = articleRepository.findById(id);
        Article article = optional.get();
        return article;
    }

//    /**
//     * 查询全部列表,并做分页
//     * @param pageNum 开始页数
//     * @param pageSize 每页显示的数据条数
//     */
//    @Override
//    public Iterator<Article> selectAll(int pageNum, int pageSize) {
//        //将参数传给这个方法就可以实现物理分页了，非常简单。
//        Sort sort = new Sort(Sort.Direction.DESC, "id");
//        Pageable pageable = new PageRequest(pageNum, pageSize, sort);
//        Page<Article> articles = articleRepository.findAll(pageable);
//        Iterator<Article> articleIterator = articles.iterator();
//        return articleIterator;
//    }

    public List<Article> selectAll() {
//        logger.info("girlList");
        return articleRepository.findAll();
    }

}
