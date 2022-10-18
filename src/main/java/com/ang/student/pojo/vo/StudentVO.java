package com.ang.student.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: 于昂
 * @date: 2022/8/15
 **/
@Data
public class StudentVO {
    @NotNull(message = "name 不能为空",groups = {})
    private String name;
    private Long cardId;
    private Long classRoomId;
}