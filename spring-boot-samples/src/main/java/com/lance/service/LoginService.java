package com.lance.service;

import com.lance.entity.UserEntity;

public interface LoginService {

    /**
     * 用户登录
     *
     * @param user
     * @return
     * @author lance
     * 2014-6-11下午11:26:05
     */
    UserEntity login(UserEntity user);
}
