package com.example.web_store.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
            new Student(
                1L,
                "Mariam",
                "marian@mail.com",
                LocalDate.of(1996, Month.APRIL, 3),
                21
            )
        );
    }
}
