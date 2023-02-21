package com.example.firstcupmongo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
@Document(collection = "Student")
@Data
public class Student {
    @Id
    private String id;
    @JsonProperty(value = "first_name")
    private String firstName;
    @JsonProperty(value = "last_name")
    private String lastName;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "department")
    private Department department;
    @JsonProperty(value = "subjects")
    private List<Subject> subjects;

    public Student(){

    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    @PersistenceConstructor
    public Student(String id, String firstName, String lastName, String email, Department department, List<Subject> subjects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.subjects = subjects;
    }
    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }
}
