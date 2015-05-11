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
    private int patient_id;


    @ManyToOne
    @JoinColumn(name = "patient_id", updatable = false, insertable = false)
    private PatientDetails patientDetails;

    @Column(name="drug_name")
    private String drugName;


    //Setters/Getters

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }


    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(PatientDetails patientDetails) {
        this.patientDetails = patientDetails;
    }


}
