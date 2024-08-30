package com.xworks.aug.inheritanceandpolymorphism;

public class Patient {
    public String patientName;
    public int id;

    public void getDetails() {
        System.out.println("name:" + patientName);
        System.out.println("Id:" + id);
    }
}
