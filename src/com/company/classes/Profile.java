package com.company.classes;

import com.company.enums.Status;

import java.util.List;

public class Profile{
    private long id;
    private String userName;
    private String password;
    private List<Profile> contacts;
    private List<String> messages;
    private Status status;
    private String image;
    private String phoneNumber;

    public Profile(long id, String userName, String password, List<Profile> contacts, List<String> messages, Status status, String image, String phoneNumber) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.contacts = contacts;
        this.messages = messages;
        this.status = status;
        this.image = image;
        this.phoneNumber = phoneNumber;
    }

    public Profile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Profile> getContacts() {
        return contacts;
    }

    public void setContacts(List<Profile> contacts) {
        this.contacts = contacts;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nProfile{" +
                "\nid=" + id +
                ",\nuserName='" + userName + '\'' +
                ",\npassword='" + password + '\'' +
                ",\ncontacts=" + contacts +
                ",\nmessages=" + messages +
                ",\nstatus=" + status +
                ",\nimage='" + image + '\'' +
                ",\nphoneNumber='" + phoneNumber + '\'' +
                '}'+"\n";
    }
}