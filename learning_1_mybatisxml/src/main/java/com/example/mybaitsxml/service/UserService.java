package com.example.mybaitsxml.service;

import com.example.mybaitsxml.dao.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAllUsers();
}
