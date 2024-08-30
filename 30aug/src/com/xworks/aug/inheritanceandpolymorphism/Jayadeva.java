package com.xworks.aug.inheritanceandpolymorphism;

public class Jayadeva extends Hospital {


            @Override
            public boolean addPatient(com.xworks.aug.inheritanceandpolymorphism.Patient patient) {
                boolean isAdded=false;
                System.out.println("Jayadeva child class started");
                if(patient!=null){
                    super.addPatient(patient);
                    isAdded=true;
                }else {
                    System.out.println("Add patient details");
                }
                System.out.println("Parent class ended");
                return isAdded;

            }
        }

