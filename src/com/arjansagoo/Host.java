package com.arjansagoo;

public class Host {
    public String firstName;
    public String lastName;
    public String companyName;
    public String email;
    public String bio;
    public int roomNo;

    public Host(String firstName, String lastName, String companyName, String email, String bio) {
        setFirstName(firstName);
        setLastName(lastName);
        setCompanyName(companyName);
        setEmail(email);
        setBio(bio);
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

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
