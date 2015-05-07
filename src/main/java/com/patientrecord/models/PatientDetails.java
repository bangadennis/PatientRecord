package com.patientrecord.models;


import javax.persistence.*;
import java.security.Timestamp;
import java.util.Date;

/**
 * Created by banga on 5/7/15.
 */
@Entity
@Table(name = "patientdetails")
public class PatientDetails {
    @Id
    @GeneratedValue
    @Column(name="patient_id")
    private int patientId;

    private String fname;

    private String lname;

    @Column(name = "dob")
    private String dateofbirth;

    private String timestamp;

    //getters and setters
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
