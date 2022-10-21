package com.ang.student.service.impl;

import com.ang.student.model.domain.User;
import com.ang.student.model.service.UserService;
import com.ang.student.pojo.vo.login.LoginReqVO;
import com.ang.student.service.AuthenticationUserService;
import com.ang.student.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author: 于昂
 * @date: 2022/10/17
 **/
@Service
public class AuthenticationUserServiceImpl implements AuthenticationUserService {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsService userDetailsService;
    private final JwtTokenUtil jwtTokenUtil;

    @Autowired
    public AuthenticationUserServiceImpl(UserService userService, PasswordEncoder passwordEncoder, UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public User getUserByName(String username) {
        return userService.getUserByName(username);
    }

    @Override
    public Boolean register(LoginReqVO request) {
        User user = getUserByName(request.getUsername());
        if (user != null) {
            throw new IllegalArgumentException("用户名已存在");
        }
        User newUser = User.builder()
                           .name(request.getUsername())
                           .passwd(passwordEncoder.encode(request.getPassword()))
                           .status(1)
                           .build();
        return userService.save(newUser);
    }

    @Override
    public String login(LoginReqVO request) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
        if (!passwordEncoder.matches(request.getPassword(), userDetails.getPassword())) {
            throw new BadCredentialsException("密码错误");
        }
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext()
                             .setAuthentication(authentication);
        return jwtTokenUtil.generateToken(userDetails);
    }
}
