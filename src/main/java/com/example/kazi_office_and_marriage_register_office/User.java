package com.example.kazi_office_and_marriage_register_office;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class User {
    public String userID, userName, email, address, role;
    protected String password;
    public int phoneNumber;

    public User(String userID, String userName, String email, String address, String role, String password, int phoneNumber) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.role = role;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(String userID, String userName, String email, String role, String password, int phoneNumber) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.role = role;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    // Defined Users
    public static User  kazi = new User("Kazi", "Kazi", "kazi@gmail.com", "", "Kazi", "12345678", Integer.parseInt("01616161616"));
    public static User registrar = new User("Registrar", "Registrar", "registrar@gmail.com", "", "Registrar", "87654321", Integer.parseInt("01616161616"));

    public static <T> void writeBinaryFile(String pathName, T object){
        try {
            File f = new File(pathName);
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new appendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(object);
            oos.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Boolean tryToLogin(){
        return true;
    }

    public Boolean forgetPassword(){
        return true;
    }

    public Boolean setNewPassword(){
        return true;
    }

    public Boolean createNewAccount(){
        return true;
    }

    public User findUser(){
        return null;
    }

}


