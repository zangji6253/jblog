package com.coderxx.jblog.service;

import com.coderxx.jblog.entity.Tag;

import java.util.List;

public interface TagService {
    /**
     * 删除
     */
    public void delete(int id);

    /**
     * 增加
     */
    public Tag insert(Tag tag);

    /**
     * 更新
     */
    public int update(Tag tag);

    /**
     * 查询单个
     */
    public Tag selectById(int id);

    /**
     * 查询全部列表
     */
    public List<Tag> selectAll();
}
