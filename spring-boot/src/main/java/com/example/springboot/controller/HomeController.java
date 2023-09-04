package com.example.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	StudentRepository repository;
	
	@GetMapping
	public String sayHi() {
		return "Hello from Spring boot!!";
	}

	@GetMapping("/student")
	public List<Student> getStudent(){
		List<Student> studList= repository.findAll();
		return studList;
		
	}
	
	@GetMapping("/student/find")
                            	//@PathVariable
	public Student getStringById(@RequestParam("id")int id) {
		Optional<Student> stud = repository.findById(id);
		if(stud.isPresent()) {
			return stud.get();
		}
		else {
			return null;
			
		}
	}

}
