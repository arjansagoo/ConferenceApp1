package com.arjansagoo;

public class Attendee {
    String firstName;
    String lastName;
    String companyName;
    Boolean hasConfirmed;
    String email;

    public Attendee(String firstName, String lastName, String companyName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setCompanyName(companyName);
        setEmail(email);
    }

    // Getters and Setters for each variable
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
