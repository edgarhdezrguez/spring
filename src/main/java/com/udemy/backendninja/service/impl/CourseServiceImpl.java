package com.udemy.backendninja.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.converted.CourseConverter;
import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.repository.CourseJpaRepository;
import com.udemy.backendninja.service.CourseService;


@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService{
	
	private static final Log LOG = LogFactory.getLog(CourseServiceImpl.class);

	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepositori;
	
	
	@Override
	public List<Course> listAllCourses() {
		LOG.info("Call: "+ "listAllCourses()");
		return courseJpaRepositori.findAll();
	}

	@Override
	public Course addCourse(CourseConverter course) {
		LOG.info("Call: "+ "addCourse()");
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
