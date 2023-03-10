package com.company.UnitechProject.entities;

import java.sql.Date;

//import javax.xml.crypto.Data;

public class Assignment {
	private int assignmentId;
    private String topic;
    private String description;
    private String questionSet;
    private Date deadline;
    private int marks;
    
    
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Assignment(int assignmentId, String topic, String description, String questionSet, Date deadline, int marks) {
		super();
		this.assignmentId = assignmentId;
		this.topic = topic;
		this.description = description;
		this.questionSet = questionSet;
		this.deadline = deadline;
		this.marks = marks;
	}


	public int getAssignmentId() {
		return assignmentId;
	}


	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getQuestionSet() {
		return questionSet;
	}


	public void setQuestionSet(String questionSet) {
		this.questionSet = questionSet;
	}


	public Date getDeadline() {
		return deadline;
	}


	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
}
