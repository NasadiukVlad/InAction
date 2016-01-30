package net.lermex.inaction.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Vlad on 29.01.2016.
 */
public class Event {
    private String eventName;
    private String eventStartTime;
    private String eventEndTime;
    private String eventDescription;

    public Event(String eventName, String eventStartTime, String eventEndTime, String eventDescription) {
        this.eventName = eventName;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(String eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    /* DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    LocalDateTime eventStartTime = LocalDateTime.parse("2016-02-10", formatter);
    LocalDateTime eventEndTime = LocalDateTime.parse(request.getEndDate(), formatter);*/

}
