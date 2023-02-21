package com.example.firstcupmongo.service;

import com.example.firstcupmongo.dao.StudentDao;
import com.example.firstcupmongo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Student getStudentById(String id){
        return studentDao.findById(id)
                .orElseThrow(() -> new RuntimeException(id+" Not Found."));
    }

    public List<Student> listAllStudent(){
        return studentDao.findAll();
    }

    public Student createStudent(Student student){
        return studentDao.save(student);
    }

    public Student updateStudent(Student student) {
        return studentDao.save(student);
    }
}
