package com.patientrecord.services;

import com.patientrecord.dao.PatientDetialsDao;
import com.patientrecord.models.PatientDetails;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * Created by banga on 5/7/15.
 */
public class PatientDetailsServiceImpl implements PatientDetailsService {
    @Autowired
    private PatientDetialsDao patientDetialsDao;

    @Override
    public int insertPatientRecord(PatientDetails patient) {
        return patientDetialsDao.insertPatientRecord(patient);
    }

    @Override
    public List<PatientDetails> getPatientList() {
        return patientDetialsDao.getPatientList();
    }
}
