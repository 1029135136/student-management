package com.ang.student.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: 于昂
 * @date: 2022/10/13
 **/
@Slf4j
@Aspect
@Component
public class AopTestAspect {

    @Before("@annotation(com.ang.student.anno.NeedTest) && args(param)")
    public void test(String param) {
        log.info("aop test" + param);
    }
}
