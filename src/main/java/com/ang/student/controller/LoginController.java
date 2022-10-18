package com.ang.student.controller;

import com.ang.student.common.CommonRes;
import com.ang.student.model.domain.User;
import com.ang.student.pojo.vo.login.LoginReqVO;
import com.ang.student.service.AuthenticationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: 于昂
 * @date: 2022/10/17
 **/
@RestController
@RequestMapping("/user")
public class LoginController {

    private final AuthenticationUserService authenticationUserService;

    @Autowired
    public LoginController(AuthenticationUserService authenticationUserService) {
        this.authenticationUserService = authenticationUserService;
    }

    @PostMapping("login")
    public CommonRes<String> login(@RequestBody @Valid LoginReqVO request) {
        String res = authenticationUserService.login(request);
        return CommonRes.success(res);
    }

    @PostMapping("register")
    public CommonRes<User> register(@RequestBody @Valid LoginReqVO request) {
        Boolean res = authenticationUserService.register(request);
        return CommonRes.success(res);
    }
}
