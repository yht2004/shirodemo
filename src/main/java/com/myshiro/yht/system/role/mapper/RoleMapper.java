package com.myshiro.yht.system.role.mapper;

import com.myshiro.yht.system.permission.entity.Permission;
import com.myshiro.yht.system.role.entity.Role;

import java.util.List;

public interface RoleMapper {
    /**
     * 根据用户ID查询角色
     */
    public List<Role> selectRoleListByUserId(int userId);

    /**
     * 根据用户名查询角色
     */
    public List<Role> selectRoleListByUsername(String username);

    /**
     * 查询角色拥有的权限
     */
    public List<Permission> permissonList();
}
