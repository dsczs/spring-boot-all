package com.lance.shiro.service;

import com.lance.shiro.domain.ModuleInfo;
import com.lance.shiro.mapper.ModuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    private ModuleMapper moduleMapper;

    /**
     * 获取角色模块
     *
     * @param userId
     * @return
     */
    public List<ModuleInfo> findModuleByUserId(int userId) {
        return moduleMapper.findModuleByUserId(userId);
    }
}
