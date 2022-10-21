package com.ang.student.controller;

import com.ang.student.common.CommonRes;
import com.ang.student.model.domain.ClassRoom;
import com.ang.student.model.service.ClassRoomService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author: 于昂
 * @date: 2022/10/21
 **/
@RestController
@RequestMapping("/classRoom")
public class ClassRoomController {
    private final ClassRoomService classRoomService;

    @Autowired
    public ClassRoomController(ClassRoomService classRoomService) {
        this.classRoomService = classRoomService;
    }

    @GetMapping("/page")
    public CommonRes<Page<ClassRoom>> page(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        return CommonRes.success(classRoomService.page(new Page<>(page, size)));
    }

    @PutMapping("update")
    public CommonRes<Boolean> update(@RequestBody ClassRoom classRoom) {
        return CommonRes.success(classRoomService.updateById(classRoom));
    }

    @DeleteMapping("{id}")
    public CommonRes<Boolean> delete(@PathVariable("id") Integer id) {
        return CommonRes.success(classRoomService.removeById(id));
    }

    @PostMapping("save")
    public CommonRes<Boolean> save(@RequestBody ClassRoom classRoom) {
        return CommonRes.success(classRoomService.save(classRoom));
    }
}
