package com.coderxx.jblog.service;

import com.coderxx.jblog.entity.Tag;
import com.coderxx.jblog.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TagServiceImpl  implements TagService{
    @Autowired
    private TagRepository tagRepository;

    /**
     * 删除 * * @param id
     */
    @Override
    public void delete(int id) {
        tagRepository.deleteById(id);
    }

    /**
     * 增加 * * @param user
     */
    @Override
    public Tag insert(Tag tag) {
        return tagRepository.save(tag);
    }

    /**
     * 更新 * * @param user
     */
    @Override
    public int update(Tag tag) {
        tagRepository.save(tag);
        return 1;
    }

    /**
     * 查询单个 * * @param id
     */
    @Override
    public Tag selectById(int id) {
        Optional<Tag> optional = tagRepository.findById(id);
        Tag tag = optional.get();
        return tag;
    }

    public List<Tag> selectAll() {
        return tagRepository.findAll();
    }
}
