package com.ang.student.controller;

import com.ang.student.pojo.vo.P96ReqVO;
import com.ang.student.pojo.vo.ProvincePowerRpcResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 于昂
 * @date: 2022/8/18
 **/
@Slf4j
@RestController
public class P96TestController {

    @RequestMapping(value = "engmgr/intranetReportConsPower/getGkconsPower96", method = RequestMethod.POST)
    public ProvincePowerRpcResult getPower(@RequestBody @Validated P96ReqVO request) {
        return ProvincePowerRpcResult.success(request.getConsNo(), request.getDataDate());
    }
}
