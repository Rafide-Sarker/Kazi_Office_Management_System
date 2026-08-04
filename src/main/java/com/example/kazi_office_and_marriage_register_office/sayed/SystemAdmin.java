package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.User;

public class SystemAdmin extends User {
    private String adminId;


    public SystemAdmin(String userID, String userName, String email, String address, String role, String password, int phoneNumber, String adminId) {
        super(userID, userName, email, address, role, password, phoneNumber);
        this.adminId = adminId;
    }

    public SystemAdmin(String userID, String userName, String email, String address, String role, String password, int phoneNumber) {
        super(userID, userName, email, address, role, password, phoneNumber);
    }

    public SystemAdmin() {
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        return "SystemAdmin{" +
                "adminId='" + adminId + '\'' +
                '}';
    }

    public void createUser() {
        return ;
    }

    public boolean manageUser() {
        return false;
    }

    public boolean resetPassword() {
        return false;
    }

    public boolean manageRole() {
        return false;
    }

    public boolean backupDatabase() {
        return false;
    }

    public boolean restoreDatabase() {
        return false;
    }

    public void generateSystemReport() {
        return ;
    }
}
