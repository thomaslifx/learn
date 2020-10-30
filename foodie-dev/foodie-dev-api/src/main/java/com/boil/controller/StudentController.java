package com.boil.controller;

import com.boil.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description    获取学生信息控制类
 * @author lifuxiang
 * @date 2020/10/29 14:20
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public Object getStudent(int id) {
        return studentService.getStudentInfo(id);
    }


    @PostMapping("/saveStudent")
    public Object saveStudent() {
        studentService.saveStudent();
        return "OK";
    }


    @PostMapping("/updateStudent")
    public Object updateStudent(int id) {
        studentService.updateStudent(id);
        return "OK";
    }

    @PostMapping("/deleteStudent")
    public Object deleteStudent(int id) {
        studentService.deleteStudent(id);
        return "OK";
    }

}
