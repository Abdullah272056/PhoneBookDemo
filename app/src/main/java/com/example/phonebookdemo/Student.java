package com.example.phonebookdemo;

public class Student {
    String name,location,phoneNumber;
    int personImage,callIcon,messageIcon;

    public Student(String name, String location, String phoneNumber, int personImage, int callIcon, int messageIcon) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.personImage = personImage;
        this.callIcon = callIcon;
        this.messageIcon = messageIcon;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public int getCallIcon() {
        return callIcon;
    }

    public void setCallIcon(int callIcon) {
        this.callIcon = callIcon;
    }

    public int getMessageIcon() {
        return messageIcon;
    }

    public void setMessageIcon(int messageIcon) {
        this.messageIcon = messageIcon;
    }
}
