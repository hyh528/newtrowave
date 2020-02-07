package com.kostars.newtroshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NewtroshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewtroshopApplication.class, args);
    }

}
