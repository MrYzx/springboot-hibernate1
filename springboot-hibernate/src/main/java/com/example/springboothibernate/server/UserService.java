package com.example.springboothibernate.server;

import com.example.springboothibernate.beans.User;

import java.util.List;

public interface UserService {

    public int saveUser(User user);

    public List showUser();
}
