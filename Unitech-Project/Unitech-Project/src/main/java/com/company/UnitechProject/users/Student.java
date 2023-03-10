package com.company.UnitechProject.users;

public class Student {
    private int StudentId;
	private static int RegistrationNo;
    private String StudentName;
    private String StudentEmailId;
    private String Password;
    private int ClassRollNo;
    private long ContactNo;

    public Student(int RegistrationNo, String StudentName, String Studentemailid, String Password, int ClassRollNo, long ContactNo) {
        this.RegistrationNo = RegistrationNo;
        this.StudentName = StudentName;
        this.StudentEmailId = Studentemailid;
        this.Password = Password;
        this.ClassRollNo = ClassRollNo;
        this.ContactNo = ContactNo;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public int getRegistrationNo() {
        return RegistrationNo;
    }

    public void setRegistrationNo(int registrationNo) {
        RegistrationNo = registrationNo;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentEmailId() {
        return StudentEmailId;
    }

    public void setStudentEmailId(String studentEmailId) {
        StudentEmailId = studentEmailId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getClassRollNo() {
        return ClassRollNo;
    }

    public void setClassRollNo(int classRollNo) {
        ClassRollNo = classRollNo;
    }

    public long getContactNo() {
        return ContactNo;
    }

    public void setContactNo(long contactNo) {
        ContactNo = contactNo;
    }
}
