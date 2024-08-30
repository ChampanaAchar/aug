package com.xworks.aug.inheritanceandpolymorphism;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital.cityName = "Banglore";
        Patient patient = new Patient();
        patient.patientName = "champs";
        patient.id = 12;

    //Polymorphism
        patient.getDetails();
        Hospital hospital1 = new Jayadeva();
        hospital1.admission(hospital1);
        Jayadeva jaydevaHospital = (Jayadeva) hospital1;


    }

}
