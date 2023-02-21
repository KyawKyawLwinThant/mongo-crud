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
        return studentService.allWithSorting();
    }
    @PutMapping("/student/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable("id")String id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("/student")
    public List<Student> findStudentsByFirstName(@RequestParam("firstName") String firstName){
        return studentService.findStudentByFirstName(firstName);
    }
    @GetMapping("/student/find/{firstName}/{email}")
    public List<Student> findStudentByFirstNameAndDepartment(
            @PathVariable String firstName,
            @PathVariable String email
    ){
        return studentService.findStudentByFirstNameAndEmail(firstName,
                email);
    }

    @GetMapping("/student/sub/{subjectName}")
    public List<Student> findStudentBySubjectName(@PathVariable("subjectName") String subjectName){
        return studentService.findStudentBySubjectName(subjectName);
    }

    @GetMapping("/student/email/{email}")
    public List<Student> findStudentByEmail(@PathVariable("email")
                                            String email){
        return studentService.findByEmail(email);
    }

}
