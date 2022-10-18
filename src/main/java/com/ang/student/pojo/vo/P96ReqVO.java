package com.ang.student.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: 于昂
 * @date: 2022/8/18
 **/
@Data
public class P96ReqVO {
    @NotNull(message = "consNo不能为空")
    private String consNo;
    @NotNull(message = "dataDate不能为空")
    private String dataDate;
}
