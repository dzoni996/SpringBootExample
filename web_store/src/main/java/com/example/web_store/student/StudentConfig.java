package com.example.web_store.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "marian@mail.com",
                    LocalDate.of(1996, Month.APRIL, 3)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@mail.com",
                    LocalDate.of(1994, Month.APRIL, 3)
            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
