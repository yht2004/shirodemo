package com.myshiro.yht.system.permission.mapper;

import com.myshiro.yht.system.permission.entity.Permission;

import java.util.List;

public interface PermissionMapper {
    /**
     * 根据角色ID查询权限
     */
    public List<Permission> selectPermissionListByRoleId(int roleId);
}
