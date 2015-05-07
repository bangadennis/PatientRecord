package com.patientrecord.models;

import javax.persistence.*;

/**
 * Created by banga on 5/7/15.
 */
@Entity
@Table(name = "patientdrugs")
public class PatientDrugs {
    //Class Members
    @Id
    @GeneratedValue
    private int pk;

    @Column(name = "patient_id")
    //@ManyToOne
    @JoinColumn(name = "patient_id")
    private int patientId;

    @Column(name="drug_name")
    private String drugName;

    //Setters/Getters
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
