package com.company.UnitechProject.users;

public class Admin {
	private int AdminId;
    private String AdminName;
    private String AdminEmailId;
    private long contactno;
    private String Password;
    private String ProfilePic;

    public Admin(int AdminId, String AdminName, String AdminEmailId, long contactno, String Password, String ProfilePic) {
        this.AdminId = this.AdminId;
        this.AdminName = this.AdminName;
        this.AdminEmailId = this.AdminEmailId;
        this.contactno = contactno;
        this.Password = this.Password;
        this.ProfilePic = ProfilePic;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getAdminEmailId() {
        return AdminEmailId;
    }

    public void setAdminEmailId(String adminEmailId) {
        AdminEmailId = adminEmailId;
    }

    public long getContactno() {
        return contactno;
    }

    public void setContactno(long contactno) {
        this.contactno = contactno;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getProfilePic() {
        return ProfilePic;
    }

    public void setProfilePic(String profilePic) {
        ProfilePic = profilePic;
    }
    
}
