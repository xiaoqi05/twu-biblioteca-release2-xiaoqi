package com.twu.biblioteca.model;

public class User {
    private String name;
    private String password;
    private String email;
    private String address;
    private String libraryNumber;
    private String phoneNumber;

    public User(String name, String password, String email, String address, String libraryNumber, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.libraryNumber = libraryNumber;
        this.phoneNumber = phoneNumber;
    }

    public String showUserInfo() {
        return "name=" + name +
                ", email=" + email +
                ", address=" + address +
                ", libraryNumber=" + libraryNumber +
                ", phoneNumber=" + phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

}
