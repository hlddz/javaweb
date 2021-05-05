package com.zgc.service.impl;

import com.zgc.dao.UserDao;
import com.zgc.domain.User;
import com.zgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class UserServiceImpl implements UserService {
//    @Autowired
    private UserDao userDao;
    private Map<String, User> userList;

    public void setUserList(Map<String, User> userList) {
        this.userList = userList;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {

        userDao.save();
    }

    @Override
    public void print() {
        System.out.println(userList); }
}
