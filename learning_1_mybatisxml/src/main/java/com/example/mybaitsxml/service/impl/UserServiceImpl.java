package com.example.mybaitsxml.service.impl;

import com.example.mybaitsxml.dao.entity.User;

import com.example.mybaitsxml.dao.mapper.UserMapper;
import com.example.mybaitsxml.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
        log.info("/queryAllUsers start...");
        return userMapper.queryAllUsers();
    }
}
