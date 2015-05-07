package com.patientrecord.services;

import com.patientrecord.dao.PatientDrugsDao;
import com.patientrecord.models.PatientDrugs;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by banga on 5/7/15.
 */
public class PatientDrugsServiceImpl implements PatientDrugsService {
    @Autowired
    private PatientDrugsDao patientDrugsDao;

    @Override
    public int insertPatientDrug(PatientDrugs patientDrug) {
        return patientDrugsDao.insertPatientDrug(patientDrug);
    }

    @Override
    public List<PatientDrugs> getPatientDrugsList() {
        return patientDrugsDao.getPatientDrugsList();
    }
}
