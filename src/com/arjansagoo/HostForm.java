package com.arjansagoo;

import java.util.Scanner;

public class HostForm {

    Scanner hostInput = new Scanner(System.in);

    public String firstNameCheck;
    public String lastNameCheck;
    public String companyNameCheck;
    public String emailCheck;
    public String bioCheck;

    public String firstNameCheck() {
        System.out.println("Please enter the Host details:");
        System.out.println("First name:");
        firstNameCheck = hostInput.nextLine();
        return firstNameCheck;
    }

    public String lastNameCheck() {
        System.out.println("Last name:");
        lastNameCheck = hostInput.nextLine();
        return lastNameCheck;
    }

    public String companyNameCheck() {
        System.out.println("Company name:");
        companyNameCheck = hostInput.nextLine();
        return companyNameCheck;
    }

    public String emailCheck() {
        System.out.println("Email:");
        emailCheck = hostInput.nextLine();
        return emailCheck;
    }

    public String bioCheck() {
        System.out.println("Bio:");
        bioCheck = hostInput.nextLine();
        return bioCheck;
    }
}
