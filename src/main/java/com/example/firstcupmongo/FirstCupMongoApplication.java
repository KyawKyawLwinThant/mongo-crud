package com.example.firstcupmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.firstcupmongo.dao")
public class FirstCupMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstCupMongoApplication.class, args);
    }

}
