package com.ang.student.model.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.student.model.domain.ClassRoom;
import com.ang.student.model.mapper.ClassRoomMapper;

@Service
public class ClassRoomService extends ServiceImpl<ClassRoomMapper, ClassRoom> {

}

