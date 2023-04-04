package com.company.UnitechProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.UnitechProject.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
