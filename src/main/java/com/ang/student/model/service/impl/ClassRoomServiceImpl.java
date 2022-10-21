package com.ang.student.model.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.student.model.domain.ClassRoom;
import com.ang.student.model.mapper.ClassRoomMapper;
import com.ang.student.model.service.ClassRoomService;
@Service
public class ClassRoomServiceImpl extends ServiceImpl<ClassRoomMapper, ClassRoom> implements ClassRoomService{

}
