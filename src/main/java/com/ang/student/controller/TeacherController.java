package com.ang.student.controller;

import com.ang.student.common.CommonRes;
import com.ang.student.model.domain.Teacher;
import com.ang.student.model.service.TeacherService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 于昂
 * @date: 2022/10/21
 **/
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("page")
    public CommonRes<Page<Teacher>> page(@RequestParam(value = "page") Integer page,
                                         @RequestParam(value = "size") Integer size) {
        Page<Teacher> teacherPage = teacherService.page(new Page<>(page, size));
        return CommonRes.success(teacherPage);
    }

    @PostMapping("save")
    public CommonRes<Boolean> save(@RequestBody Teacher teacher) {
        return CommonRes.success(teacherService.save(teacher));
    }

    @PutMapping("update")
    public CommonRes<Boolean> update(@RequestBody Teacher teacher) {
        return CommonRes.success(teacherService.updateById(teacher));
    }

    @DeleteMapping("{id}")
    public CommonRes<Boolean> delete(@PathVariable(value = "id") Integer id) {
        return CommonRes.success(teacherService.removeById(id));
    }
}
