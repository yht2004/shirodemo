package com.myshiro.yht.system.role.entity;

import com.myshiro.yht.system.permission.entity.Permission;

import java.io.Serializable;
import java.util.List;

/**
 * 角色实体类
 */
public class Role implements Serializable {
    private int id;
    private String name;

    /**权限集合*/
    private List<Permission> permissionList;

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
