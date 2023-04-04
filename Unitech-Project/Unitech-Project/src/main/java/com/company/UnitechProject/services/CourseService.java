package com.company.UnitechProject.services;

import java.util.List;

import com.company.UnitechProject.entities.Course;

public interface CourseService {
	public List<Course> getCourse();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long courseId);
}
