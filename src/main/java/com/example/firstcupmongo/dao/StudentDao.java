package com.example.firstcupmongo.dao;

import com.example.firstcupmongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface StudentDao extends MongoRepository<Student,String> {

    List<Student> findBySubjectsSubjectName(String subjectName);

    List<Student> findStudentByFirstName(String firstName);
    List<Student> findAllByFirstNameAndEmail(String firstName,

                                                   String email);
    @Query("{\"email\": \"?0\"}")
    List<Student> getByEmail(String name);
}
