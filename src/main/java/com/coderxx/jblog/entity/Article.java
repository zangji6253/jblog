package com.coderxx.jblog.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "article")
public class Article {
    public Article() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

//    @Column(nullable = false)
//    private String sex;
//
//    @Column(nullable = false)
//    private String address;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Date CREATETIME;

    @Column(name="UPDATETIME")
    @org.hibernate.annotations.UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date UPDATETIME;

//    @Id @Column(length = 20)
//    private String cid;
//
//    @Column(length = 40)
//    private String cname;
//
//    private Integer price;//价格
//
//    private Integer stock_quantity;//库存数量
//
//    private Integer Sales_volume;//销售数量

    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String content;//文章内容
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Category category;

}

