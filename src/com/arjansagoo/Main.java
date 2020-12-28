package com.arjansagoo;

import javax.accessibility.AccessibleText;

public class Main {

    public static void main(String[] args) {

        // User Input Form for personal data
        // Create userForm class to separate user input

        System.out.println("Welcome to the Conference Call");
        System.out.println("In order to host your Conference Call, enter your details below:");
        System.out.println(" ");


        // Create instance of hostInput and attendeeInput to import user data
        HostForm hostForm = new HostForm();
        String hostFirstName = hostForm.firstNameCheck();
        String hostLastName = hostForm.lastNameCheck();
        String hostCompanyName = hostForm.companyNameCheck();
        String hostEmail = hostForm.emailCheck();
        String hostBio = hostForm.bioCheck();

        // Create instance of a host
        Host host = new Host(hostFirstName, hostLastName, hostCompanyName, hostEmail, hostBio);


        boolean addCheck = false;

        while(addCheck == true) {
            AttendeeForm attendeeForm = new AttendeeForm();
            String attendFirstName = attendeeForm.firstNameCheck();
            String attendLastName = attendeeForm.lastNameCheck();
            String attendCompanyName = attendeeForm.companyNameCheck();
            String attendEmail = attendeeForm.emailCheck();
            String attendAddCheck = attendeeForm.addAnother();

            if (attendAddCheck == "yes") {
                addCheck = true;
            } else if (attendAddCheck == "no") {
                addCheck = false;
            }
        }

        Attendee attendee = new Attendee(attendFirstName, attendLastName, attendCompanyName, attendEmail);

        System.out.println(host.getFirstName() + " " + host.getLastName());
        System.out.println(host.getCompanyName());
        System.out.println(host.getEmail());
        System.out.println(host.getBio());

        System.out.println(attendee.getFirstName() + " " + attendee.getLastName());
        System.out.println(attendee.getEmail());

    }

}
