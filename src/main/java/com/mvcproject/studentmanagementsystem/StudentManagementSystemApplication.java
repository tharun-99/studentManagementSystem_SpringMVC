package com.mvcproject.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mvcproject.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Tharun", "kumar", "tharun@gmail.com");
//		Student student2 = new Student("Kumar", "reddy", "kumar@gmail.com");
//		Student student3 = new Student("Reddy", "tharun", "reddy@gmail.com");
//		
//		studentRepository.saveAll(Arrays.asList(student1, student2, student3));
		
	}

}
