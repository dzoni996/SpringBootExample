package com.example.web_store;

import com.example.web_store.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class WebStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStoreApplication.class, args);
	}
	@GetMapping
	public List<Student> hello() {
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
