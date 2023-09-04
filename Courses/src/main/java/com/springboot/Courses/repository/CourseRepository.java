package com.springboot.Courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Courses.model.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer> {

}
