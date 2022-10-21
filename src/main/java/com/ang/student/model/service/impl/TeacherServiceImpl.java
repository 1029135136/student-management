package com.ang.student.model.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.student.model.mapper.TeacherMapper;
import com.ang.student.model.domain.Teacher;
import com.ang.student.model.service.TeacherService;
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService{

}
