package com.arjansagoo;
import java.util.Scanner;

public class ConferenceForm {

    String conNameCheck;
    String conDescriptionCheck;
    int roomNoCheck;

    Scanner conferenceInput = new Scanner(System.in);

    public String conNameCheck() {
        System.out.println("Enter conference name:");
        conNameCheck = conferenceInput.nextLine();
        return conNameCheck;
    }

//    public String getConDescriptionCheck {
//
//    }

}
