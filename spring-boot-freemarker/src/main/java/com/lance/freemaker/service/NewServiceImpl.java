package com.lance.freemaker.service;

import com.lance.freemaker.domain.NewsInfo;
import com.lance.freemaker.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewServiceImpl implements NewService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<NewsInfo> findAll(int pageNo) {
        return newsMapper.findAll(pageNo);
    }

    @Override
    public NewsInfo findOne(int id) {
        return newsMapper.findOne(id);
    }

    @Transactional
    public void save(NewsInfo info) {
        newsMapper.save(info);
    }

    @Override
    public int findCount() {
        return newsMapper.findCount();
    }
}
