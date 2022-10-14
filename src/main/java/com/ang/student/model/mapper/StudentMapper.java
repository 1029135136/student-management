package com.ang.student.model.mapper;

import com.ang.student.model.domain.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface StudentMapper extends BaseMapper<Student> {
    Student selectXXX();
}
