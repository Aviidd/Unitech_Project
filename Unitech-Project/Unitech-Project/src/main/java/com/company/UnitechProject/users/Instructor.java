package com.company.UnitechProject.users;

public class Instructor {
	private int InstructorId;
    private String InstructorName;
    private String InstructorEmailId;
    private long registrationno;
    private String Password;
    private long contactno;
    private String ProfilePic;

    public Instructor(int instructorId, String instructorName, String instructorEmailId, long registrationno, String password, int contactno, String profilePic) {
        this.InstructorId = InstructorId;
        this.InstructorName = InstructorName;
        this.InstructorEmailId = InstructorEmailId;
        this.registrationno = registrationno;
        this.Password = Password;
        this.contactno = contactno;
        this.ProfilePic = ProfilePic;
    }

    public int getInstructorId() {
        return InstructorId;
    }

    public void setInstructorId(int instructorId) {
        InstructorId = instructorId;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String instructorName) {
        InstructorName = instructorName;
    }

    public String getInstructorEmailId() {
        return InstructorEmailId;
    }

    public void setInstructorEmailId(String instructorEmailId) {
        InstructorEmailId = instructorEmailId;
    }

    public long getRegistrationno() {
        return registrationno;
    }

    public void setRegistrationno(long registrationno) {
        this.registrationno = registrationno;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public long getContactno() {
        return contactno;
    }

    public void setContactno(long contactno) {
        this.contactno = contactno;
    }

    public String getProfilePic() {
        return ProfilePic;
    }

    public void setProfilePic(String profilePic) {
        ProfilePic = profilePic;
    }

}
