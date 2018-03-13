package com.udemy.backendninja.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.repository.CourseJpaRepository;
import com.udemy.backendninja.service.CourseService;

public class CourseServiceImpl implements CourseService{

	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepositori;
	
	
	@Override
	public List<Course> listAllCourses() {
		return courseJpaRepositori.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		return courseJpaRepositori.save(course);
	}

	@Override
	public int removeCourse(int id) {
		courseJpaRepositori.delete(id);
		return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		
		return courseJpaRepositori.save(course);
	}
	

}
