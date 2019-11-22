package com.myshiro.yht.system.user.mapper;

import com.myshiro.yht.system.user.entity.User;

public interface UserMapper {
    /**
     * 根据用户ID查询用户
     */
    public User selectUserByUserId(int userId);


    /**
     * 根据用户名称查询用户
     */
    public User electUserByUserName(String username);

}
