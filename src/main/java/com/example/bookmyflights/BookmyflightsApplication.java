package com.example.bookmyflights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.bookmyflights.repository")
public class BookmyflightsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookmyflightsApplication.class, args);
    }
}
