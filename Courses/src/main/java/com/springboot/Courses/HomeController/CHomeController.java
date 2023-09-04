package com.springboot.Courses.HomeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Courses.intercomm.StudentClient;
import com.springboot.Courses.model.Courses;
import com.springboot.Courses.model.Student;
import com.springboot.Courses.repository.CourseRepository;

@RestController
@RequestMapping("/home")
public class CHomeController {

	@Autowired
	CourseRepository repository;

	@Autowired
	StudentClient studClient;

	@GetMapping("/view")
	public List<Courses> getCourses() {
		return repository.findAll();
	}

	@GetMapping("/service/stud/{studId}")
	public Student getStud(@PathVariable int studId) {
		return studClient.getStudent(studId);

	}

	@GetMapping("/Courses/find/{id}")
	public Courses getCourseById(@PathVariable("id")int id)
	{
		Optional<Courses> cou= Courses.findById(id);
		if(cou.isPresent()) {
			return cou.get();
		}
		else{
				return null;
		
		}
	}

}
