package com.wal.springbootdemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 学生Controller
 */
@RestController
public class StudentController {

    @Resource
    StudentService studentService;

    @GetMapping("/student")
    public String student(@RequestParam Integer num){
        Student student = studentService.findStudent(num);
        return student.toString();
    }
}
