package com.byteshaft.medicosperuanos.gettersetter;

/**
 * Created by s9iper1 on 4/19/17.
 */

public class PatientAppointment {

    private String date;
    private String drFirstName;
    private String drLastName;
    private String appointmentTime;
    private String serviceName;
    private String state;
    private String drSpeciality;
    private int doctorsId;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    public String getDrLastName() {
        return drLastName;
    }

    public void setDrLastName(String drLastName) {
        this.drLastName = drLastName;
    }

    public int getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(int doctorsId) {
        this.doctorsId = doctorsId;
    }


    public String getDrSpeciality() {
        return drSpeciality;
    }

    public void setDrSpeciality(String drSpeciality) {
        this.drSpeciality = drSpeciality;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDrFirstName() {
        return drFirstName;
    }

    public void setDrFirstName(String drFirstName) {
        this.drFirstName = drFirstName;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}