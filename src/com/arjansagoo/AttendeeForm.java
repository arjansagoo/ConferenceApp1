package com.arjansagoo;
import java.util.Scanner;

public class AttendeeForm {

    Scanner attendeeInput = new Scanner(System.in);

    public String firstNameCheck;
    public String lastNameCheck;
    public String companyNameCheck;
    public String emailCheck;
    public String addCheck;

    public String firstNameCheck() {
        System.out.println("Please enter the Attendee details:");
        System.out.println("First name:");
        firstNameCheck = attendeeInput.nextLine();
        return firstNameCheck;
    }

    public String lastNameCheck() {
        System.out.println("Last name:");
        lastNameCheck = attendeeInput.nextLine();
        return lastNameCheck;
    }

    public String companyNameCheck() {
        System.out.println("Company name:");
        companyNameCheck = attendeeInput.nextLine();
        return companyNameCheck;
    }

    public String emailCheck() {
        System.out.println("Email:");
        emailCheck = attendeeInput.nextLine();
        return emailCheck;
    }

    public String addAnother() {
        System.out.println("Do you want to add another attendee?");
        addCheck = attendeeInput.nextLine();
        if (addCheck == "no") {
            return "no";
        } else if (addCheck == "yes") {
            return "yes";
        }
        else return "Error!";
    }
}
