package com.zhyyyyy.exercisesspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExercisesSpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExercisesSpringcloudApplication.class, args);
    }
}
