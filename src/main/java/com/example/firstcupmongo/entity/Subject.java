package com.example.firstcupmongo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
public class Subject {
    @JsonProperty(value = "subject_name")
    private String subjectName;
    @JsonProperty(value = "marks_obtained")
    private int marksObtained;
}
