package com.liuwenjing.dao;

import com.liuwenjing.domain.User;

import java.util.List;

/**
 * @Author: liuwenjing
 * @Description:
 * @Date: Create in 20:51 2020/3/7
 */
public interface IUserDao {
    List<User> findAll();
}
