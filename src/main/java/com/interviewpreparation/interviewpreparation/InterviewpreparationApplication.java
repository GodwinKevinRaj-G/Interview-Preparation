package com.interviewpreparation.interviewpreparation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class InterviewpreparationApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewpreparationApplication.class, args);
    }

}
