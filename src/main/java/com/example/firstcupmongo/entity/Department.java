package com.example.firstcupmongo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
public class Department {
    @JsonProperty(value = "departemnt_name")
    String departmentName;
}
