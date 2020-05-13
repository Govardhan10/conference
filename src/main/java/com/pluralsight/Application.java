package com.pluralsight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
In case of WAR deployments we have to extend our application to generate
the context needed for a WAR deployment
public class Application extends SpringBootServletInitializer {
 */
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
