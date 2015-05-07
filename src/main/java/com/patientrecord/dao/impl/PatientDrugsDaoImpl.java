package com.patientrecord.dao.impl;

import com.patientrecord.dao.PatientDetialsDao;
import com.patientrecord.dao.PatientDrugsDao;
import com.patientrecord.models.PatientDrugs;
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
public class PatientDrugsDaoImpl implements PatientDrugsDao {
    @Autowired
    SessionFactory sessionFactory;
    @Transactional
    @Override
    public int insertPatientDrug(PatientDrugs patientDrug) {
            Session session =sessionFactory.openSession();
            Transaction tx=session.beginTransaction();
            session.save(patientDrug);
            tx.commit();
            Serializable id=session.getIdentifier(patientDrug);
            session.close();
            return (Integer) id;

    }

    @Override
    public List<PatientDrugs> getPatientDrugsList() {
        Session session=sessionFactory.openSession();
        List<PatientDrugs> patientDrugsList =session.createQuery("from PatientDrugs").list();
        session.close();

        return patientDrugsList;
    }
}
