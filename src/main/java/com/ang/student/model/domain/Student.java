package com.ang.student.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "student")
public class Student {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "card_id")
    private Long cardId;

    @TableField(value = "class_room_id")
    private Long classRoomId;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_CARD_ID = "card_id";

    public static final String COL_CLASS_ROOM_ID = "class_room_id";
}