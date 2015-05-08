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

    //@ManyToOne
    //@JoinColumn(name = "patientId")
    private int patient_id;

    @Column(name="drug_name")
    private String drugName;

    //Setters/Getters
    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
}
