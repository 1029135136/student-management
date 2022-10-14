package com.ang.student.controller;

import com.ang.student.common.CommonRes;
import com.ang.student.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 于昂
 * @date: 2022/10/13
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/aop",method = RequestMethod.GET)
    public CommonRes<String> aopTest() {
        testService.doSomething("hello world");
        return CommonRes.success("aop test");
    }
}
