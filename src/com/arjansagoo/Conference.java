package com.arjansagoo;
import java.util.Date;
import java.util.TimeZone;
import com.arjansagoo.ConferenceForm;

public class Conference {
    Date date = new Date();
    TimeZone time;
    String conName;
    String conDescription;
    int roomNo;
    String attendee;
    String host;
    String[] attendees = {};

    public Conference() {

    }

    public String getName() {
        return this.conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConDescription() {
        return this.conDescription;
    }

    public void setConDescription(String conDescription) {
        this.conDescription = conDescription;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }


}
