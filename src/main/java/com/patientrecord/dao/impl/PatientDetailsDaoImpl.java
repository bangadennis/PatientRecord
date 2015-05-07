package com.patientrecord.dao.impl;

import com.patientrecord.dao.PatientDetialsDao;
import com.patientrecord.models.PatientDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by banga on 5/7/15.
 */
public class PatientDetailsDaoImpl implements PatientDetialsDao {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertPatientRecord(PatientDetails patient) {
        Session session =sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(patient);
        tx.commit();
        Serializable id=session.getIdentifier(patient);
        session.close();
        return (Integer) id;
    }

    @Override
    public List<PatientDetails> getPatientList() {
        Session session=sessionFactory.openSession();
        List<PatientDetails> patientList =session.createQuery("from PatientDetails").list();
        session.close();

        return patientList;
    }
}
