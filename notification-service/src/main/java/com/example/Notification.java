package com.example;

public class Notification {

    private int id;
    private String message;
    private String recipient;

    public Notification() {
    }

    public Notification(int id, String message, String recipient) {
        this.id = id;
        this.message = message;
        this.recipient = recipient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}

