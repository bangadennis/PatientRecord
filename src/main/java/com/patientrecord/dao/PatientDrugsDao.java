package com.patientrecord.dao;

import com.patientrecord.models.PatientDrugs;

import java.util.List;

/**
 * Created by banga on 5/7/15.
 */
public interface PatientDrugsDao {

    public int insertPatientDrug(PatientDrugs patientDrug);

    public List<PatientDrugs> getPatientDrugsList();

}
