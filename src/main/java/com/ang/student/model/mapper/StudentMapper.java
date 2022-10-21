package com.ang.student.model.mapper;

import com.ang.student.model.domain.Student;
import com.ang.student.pojo.vo.student.StudentResVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface StudentMapper extends BaseMapper<Student> {
    Page<StudentResVO> selectPageWithClassRom(Page<StudentResVO> page);
}
