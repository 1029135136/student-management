package com.ang.student.model.service;

import com.ang.student.model.domain.User;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserService extends IService<User>{

    User getUserByName(String username);
}
