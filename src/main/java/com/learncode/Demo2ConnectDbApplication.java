package com.learncode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learncode.model.Student;

@SpringBootApplication
public class Demo2ConnectDbApplication implements CommandLineRunner {

	@Autowired
	private StudentRepositori studentRepo;
	public static void main(String[] args) {
		SpringApplication.run(Demo2ConnectDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Student> students = studentRepo.findAll();
		students.forEach(System.out :: println);
		
	}

}
