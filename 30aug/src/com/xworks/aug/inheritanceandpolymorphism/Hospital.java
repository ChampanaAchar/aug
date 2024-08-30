package com.xworks.aug.inheritanceandpolymorphism;

public class Hospital {
    public String Patient;
    public Patient patient;
    public static String cityName;

    public boolean addPatient(Patient patient){
        System.out.println("Parent class started");
        boolean isAdded=false;
        if(patient!=null){
            this.patient =patient;
            isAdded=true;
        }else {
            System.out.println("Add patient details");
        }
        System.out.println("Parent class ended");
        return isAdded;
    }
    public void admission(Hospital hos){
        System.out.println("Patient is admitted in:"+hos.getClass().getSimpleName());
    }
}
