package com.patientrecord.controllers;

import javax.persistence.*;

/**
 * Created by banga on 5/7/15.
 */
@Entity
@Table(name = "patientdrugs")
public class PatientRecord {
    @Id
    @GeneratedValue
    private int pk;

    @Column(name="patient_id")
    private int patientId;

    @Column(name="drug_name")
    private String drugName;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
}
