package com.ang.student.model.service.impl;

import com.ang.student.model.service.StudentService;
import com.ang.student.pojo.vo.student.StudentResVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.student.model.domain.Student;
import com.ang.student.model.mapper.StudentMapper;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Override
    public Page<StudentResVO> pageWithClassRom(Page<StudentResVO> page) {
        return this.baseMapper.selectPageWithClassRom(page);
    }
}

