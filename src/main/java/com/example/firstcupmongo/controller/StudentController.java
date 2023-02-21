package com.example.firstcupmongo.controller;

import com.example.firstcupmongo.dao.StudentDao;
import com.example.firstcupmongo.entity.Student;
import com.example.firstcupmongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value="/student/create"
            ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @GetMapping("/student/{id}")
    public Student  getStudentById(@PathVariable("id") String id){
        return studentService.getStudentById(id);
    }
    @GetMapping("/student/students")
    public List<Student> findAllStudent(){
        return studentService.listAllStudent();
    }
    @PutMapping("/student/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
}
