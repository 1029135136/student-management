package com.ang.student.pojo.vo.student;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author: 于昂
 * @date: 2022/10/21
 **/
@Data
public class StudentResVO {
    private Long id;

    private String name;

    private Long cardId;

    private Long classRoomId;

    private String classRoomName;
}
