package com.richyyin.web.dao;

import com.richyyin.web.module.User;
import org.springframework.stereotype.Repository;

import javax.naming.Name;

/**
 * @author yyq
 * @date 2018-11-10
 */
@Repository("userDao")
public interface UserDao {

    User get(int id);

    int add(User user);

    int mod(User user);

    int remove(int id);

}
