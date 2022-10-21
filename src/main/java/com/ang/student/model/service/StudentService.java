package com.ang.student.model.service;

import com.ang.student.model.domain.Student;
import com.ang.student.pojo.vo.student.StudentResVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
public interface StudentService extends IService<Student>{


    Page<StudentResVO> pageWithClassRom(Page<StudentResVO> objectPage);
}
