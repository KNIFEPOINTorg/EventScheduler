package com.event.model;

import java.util.Date;

public class Event extends BaseEntity implements Reportable {
    private int userId;
    private String title;
    private Date eventDate;
    private String description;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventDate(String eventDateStr) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
            this.eventDate = sdf.parse(eventDateStr);
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String generateReport() {
        return String.format("Event Report: ID=%d, Title=%s", getId(), title);
    }

    @Override
    public String toString() {
        String dateStr = eventDate == null ? "" : new java.text.SimpleDateFormat("yyyy-MM-dd").format(eventDate);
        return String.format("[%d] user=%d title=\"%s\" date=%s desc=\"%s\"", getId(), userId, title, dateStr, description);
    }
} 