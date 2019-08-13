package com.example.StudentRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class StudentRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationApplication.class, args);
	}

}
