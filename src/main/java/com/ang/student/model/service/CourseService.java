package com.ang.student.model.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.student.model.mapper.CourseMapper;
import com.ang.student.model.domain.Course;
@Service
public class CourseService extends ServiceImpl<CourseMapper, Course> {

}
