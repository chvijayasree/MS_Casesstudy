package com.springboot.Courses.intercomm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.Courses.model.Student;

@FeignClient(name="student", url="http://localhost:8081")
public interface StudentClient {
	@PostMapping(value="/home/student/find", consumes ="appication/json")
	Student getStudent(@RequestBody int StudentId);

}
