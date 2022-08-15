package com.ang.student.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 学生
 */
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

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return card_id
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * @param cardId
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    /**
     * @return class_room_id
     */
    public Long getClassRoomId() {
        return classRoomId;
    }

    /**
     * @param classRoomId
     */
    public void setClassRoomId(Long classRoomId) {
        this.classRoomId = classRoomId;
    }
}