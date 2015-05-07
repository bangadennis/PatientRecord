package com.patientrecord.dao;

import com.patientrecord.models.PatientDetails;

import java.util.List;

/**
 * Created by banga on 5/7/15.
 */
public interface PatientDetialsDao {

    public int insertPatientRecord(PatientDetails patient);

    public List<PatientDetails>  getPatientList();


}
