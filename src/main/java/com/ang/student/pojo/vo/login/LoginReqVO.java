package com.ang.student.pojo.vo.login;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author: 于昂
 * @date: 2022/10/17
 **/
@Data
public class LoginReqVO {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
}
