package com.springboot.Courses.model;




import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;


@Entity
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int CourseId;
	private String CourseName;
	private int CourseFee;

	public Courses() {

	}

	public Courses(int CourseId, String CourseName, int CourseFee) {
		super();
		this.CourseId = CourseId;
		this.CourseName = CourseName;
		this.CourseFee = CourseFee;

	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		this.CourseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}

	public int getCourseFee() {
		return CourseFee;
	}

	public void setCourseFee(int courseFee) {
		this.CourseFee = courseFee;
	}

	public static Optional<Courses> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
