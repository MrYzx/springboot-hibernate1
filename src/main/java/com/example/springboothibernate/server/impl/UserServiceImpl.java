package com.example.springboothibernate.server.impl;

import com.example.springboothibernate.beans.User;
import com.example.springboothibernate.dao.UserDao;
import com.example.springboothibernate.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional(rollbackOn = Exception.class)
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List showUser() {
        return null;
    }
}
