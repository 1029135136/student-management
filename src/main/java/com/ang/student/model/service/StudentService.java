package com.ang.student.model.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.student.model.domain.Student;
import com.ang.student.model.mapper.StudentMapper;
@Service
public class StudentService extends ServiceImpl<StudentMapper, Student> {

}
