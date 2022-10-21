package com.ang.student.model.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.student.model.mapper.UserMapper;
import com.ang.student.model.domain.User;
import com.ang.student.model.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User getUserByName(String username) {
        return this.getOne(Wrappers.<User>lambdaQuery()
                                   .eq(User::getName, username)
                                   .last("limit 1"));
    }
}
