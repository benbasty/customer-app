package com.springprojects.customerapp;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Customer's ID: " + this.id + "\n" +
                "Customer's First Name: " + this.firstName + "\n" +
                "Customer's Last Name: " + this.lastName + "\n" +
                "Customer's Address: " + this.address;
    }
}
