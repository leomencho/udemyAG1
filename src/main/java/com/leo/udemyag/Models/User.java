package com.leo.udemyag.Models;

public class User {

    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {}
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {}
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
