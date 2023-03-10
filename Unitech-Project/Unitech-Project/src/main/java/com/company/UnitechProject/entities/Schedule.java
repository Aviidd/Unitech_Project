package com.company.UnitechProject.entities;

import java.sql.Date;

public class Schedule {
	private Date startDate;
    private Date endDate;
    
    
	public Schedule(Date startDate, Date endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
    
    
}
