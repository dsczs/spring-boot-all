package com.lance.mybatis.service;

import com.lance.mybatis.domain.UserInfo;
import com.lance.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> findAll() {
        return userMapper.findAll();
    }

    @Override
    public UserInfo findOne(int id) {
        return userMapper.findOne(id);
    }

}
