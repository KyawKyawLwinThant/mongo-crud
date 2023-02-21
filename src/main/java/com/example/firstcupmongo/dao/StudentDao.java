package com.example.firstcupmongo.dao;

import com.example.firstcupmongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentDao extends MongoRepository<Student,String> {
}
