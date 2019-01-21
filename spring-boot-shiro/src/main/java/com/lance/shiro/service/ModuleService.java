package com.lance.shiro.service;

import com.lance.shiro.domain.ModuleInfo;

import java.util.List;

public interface ModuleService {
    /**
     * 获取角色模块
     *
     * @param userId
     * @return
     */
    List<ModuleInfo> findModuleByUserId(int userId);
}
