package com.ang.student.service.impl;

import com.ang.student.anno.NeedTest;
import com.ang.student.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: 于昂
 * @date: 2022/10/13
 **/
@Slf4j
@Service
public class TestServiceImpl implements TestService {
    @NeedTest
    @Override
    public void doSomething(String param) {
        log.info("do something");
    }
}
