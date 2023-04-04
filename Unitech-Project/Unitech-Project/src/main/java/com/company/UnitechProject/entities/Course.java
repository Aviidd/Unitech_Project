package com.company.UnitechProject.entities;

public class Course {
	private int CourseId;
    private String name;
    private int Courseduration;
    private int CourseCredit;
    private int EnrolledStudents;
    
    
    public Course() {
    	
    }
    
    public Course(int courseId, String name, int courseduration, int courseCredit, int enrolledStudents) {
		super();
		CourseId = courseId;
		this.name = name;
		Courseduration = courseduration;
		CourseCredit = courseCredit;
		EnrolledStudents = enrolledStudents;
	}


	public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseduration() {
        return Courseduration;
    }

    public void setCourseduration(int courseduration) {
        Courseduration = courseduration;
    }

    public int getCourseCredit() {
        return CourseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        CourseCredit = courseCredit;
    }

    public int getEnrolledStudents() {
        return EnrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        EnrolledStudents = enrolledStudents;
    }

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescription(Object description) {
		// TODO Auto-generated method stub
		
	}
}
