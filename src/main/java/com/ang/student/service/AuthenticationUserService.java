package com.ang.student.service;

import com.ang.student.model.domain.User;
import com.ang.student.pojo.vo.login.LoginReqVO;

/**
 * @author: 于昂
 * @date: 2022/10/17
 **/
public interface AuthenticationUserService {
    User getUserByName(String username);

    Boolean register(LoginReqVO request);

    String login(LoginReqVO request);
}
