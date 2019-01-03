package com.coderxx.jblog.repository;

import com.coderxx.jblog.entity.ArticleTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleTagRepository  extends JpaRepository<ArticleTag, Integer> {
}
