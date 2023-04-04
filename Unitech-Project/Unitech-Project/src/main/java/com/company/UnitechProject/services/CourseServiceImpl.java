package com.company.UnitechProject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.UnitechProject.dao.CourseDao;
import com.company.UnitechProject.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	private object courseService;
	
	public CourseServiceImpl(){
		// in this we temporary add the course using constructor
		list = new ArrayList<>();
		list.add(new Course(145, "Java core course", "this course contain basics of java"));
		list.add(new Course(200,  "Spring core course", "this course contain basics of java"));
		list.add(new Course(300, "Microservices core course", "this course contain basics of java"));
		
	}

	@Override
	public List<Course> getCourse() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
			return c;
		}
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e -> {
			if(e.getId() == course.getId());{
				e.setName(course.getName());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		list = this.list.stream().filter(e->e.getId() != parseLong).collect(Collectors.toList());
		
	}
	
}
