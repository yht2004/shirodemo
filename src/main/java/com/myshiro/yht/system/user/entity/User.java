package com.myshiro.yht.system.user.entity;

import com.myshiro.yht.system.role.entity.Role;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户实体
 */
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private Date createTime;
    private String salt;
    /**权限集合*/
    private List<Role> roleList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
