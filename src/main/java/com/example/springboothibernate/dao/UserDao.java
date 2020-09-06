package com.example.springboothibernate.dao;

import com.example.springboothibernate.beans.User;

import java.util.List;

public interface UserDao {

    public List showUser();

    public int saveUser(User user);

}
