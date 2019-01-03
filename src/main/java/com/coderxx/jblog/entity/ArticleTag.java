package com.coderxx.jblog.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "article_tag")
public class ArticleTag {
    public ArticleTag() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer article_id;//文章编号

    private Integer tag_id;//标签编号

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Date CREATETIME;

    @Column(name = "UPDATETIME")
    @org.hibernate.annotations.UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date UPDATETIME;
}
