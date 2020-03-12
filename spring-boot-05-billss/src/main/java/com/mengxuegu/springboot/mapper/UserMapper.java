package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.User;

import java.util.List;

/**
 * @Author: liuwenjing
 * @Description:
 * @Date: Create in 18:59 2020/3/8
 */
public interface UserMapper {
    User getUserByUsername(String username);

    List<User> getUsers(User user);

    User getUserById(Integer id);

    int addUser(User user);

    int deleteUserById(Integer id);

    int updateUser(User user);
}
