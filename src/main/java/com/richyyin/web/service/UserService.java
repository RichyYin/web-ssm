package com.richyyin.web.service;

import com.richyyin.web.dao.UserDao;
import com.richyyin.web.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yyq
 * @date 2018-11-10
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getByUserId(int id) {
        return userDao.get(id);
    }

    public int addUser(User user) {
        return userDao.add(user);
    }

    public int modUser(User user) {
        return userDao.mod(user);
    }

    public int deleteUser(int id) {
        return userDao.remove(id);
    }

}
