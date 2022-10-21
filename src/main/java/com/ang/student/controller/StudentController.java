package com.ang.student.controller;

import com.ang.student.common.CommonRes;
import com.ang.student.model.domain.Student;
import com.ang.student.model.service.StudentService;
import com.ang.student.pojo.vo.student.StudentResVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 于昂
 * @date: 2022/8/15
 **/
@Slf4j
@RestController
@RequestMapping("student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "page", method = RequestMethod.GET)
    public CommonRes<Page<StudentResVO>> pageList(@RequestParam("page") Long page, @RequestParam("size") Long size) {
        Page<StudentResVO> result = studentService.pageWithClassRom(new Page<>(page, size));
        return CommonRes.success(result);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public CommonRes<List<Student>> list() {
        return CommonRes.success(studentService.list());
    }

    @RequestMapping(value = "getById/{userId}", method = RequestMethod.GET)
    public CommonRes<Student> getById(@PathVariable("userId") Long userId) {
        return CommonRes.success(studentService.getById(userId));
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public CommonRes<Boolean> save(@RequestBody Student student) {
        return CommonRes.success(studentService.save(student));
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public CommonRes<Boolean> edit(@RequestBody Student student) {
        return CommonRes.success(studentService.updateById(student));
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public CommonRes<Boolean> destroy(@PathVariable("id") Long id) {
        return CommonRes.success(studentService.removeById(id));
    }
}
