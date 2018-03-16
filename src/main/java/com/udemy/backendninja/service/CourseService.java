package com.udemy.backendninja.service;

import java.util.List;

import com.udemy.backendninja.converted.CourseConverter;
import com.udemy.backendninja.entity.Course;

public interface CourseService {
	
	public abstract List<Course> listAllCourses();
	public abstract Course addCourse(CourseConverter course);
	public abstract int removeCourse(int id);
	public abstract Course updateCourse(Course course);
	

}
