package com.ang.student.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "class_room")
public class ClassRoom {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 班主任
     */
    @TableField(value = "teacher_id")
    private Long teacherId;

    /**
     * 年级
     */
    @TableField(value = "grade")
    private Integer grade;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_TEACHER_ID = "teacher_id";

    public static final String COL_GRADE = "grade";
}