package com.ang.student.model.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.student.model.mapper.TeacherMapper;
import com.ang.student.model.domain.Teacher;
@Service
public class TeacherService extends ServiceImpl<TeacherMapper, Teacher> {

}
