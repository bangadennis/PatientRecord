package com.patientrecord.controllers;


import com.patientrecord.models.PatientDetails;
import com.patientrecord.models.PatientDrugs;
import com.patientrecord.services.PatientDetailsService;
import com.patientrecord.services.PatientDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by banga on 5/7/15.
 */
@Controller
public class PatientRecord {
    @Autowired
    PatientDetailsService patientDetailsService;
    //@Autowired
   // PatientDrugsService patientDrugsService;

    @RequestMapping("/addpatient")
    public ModelAndView addPatient
            (@RequestParam(value = "fname", required = false) String fname,
             @RequestParam(value = "lname", required = false) String lname,
             @RequestParam(value = "dateofbirth", required = false) Date dateofbirth ) {

        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Hello Patients");
        PatientDetails patient = new PatientDetails();
        patient.setFname(fname);
        patient.setLname(lname);
        patient.setDateofbirth(dateofbirth);
        patientDetailsService.insertPatientRecord(patient);

        model.setViewName("patientdetails");
        return model;
    }

  /*  @RequestMapping("/add_drug")
    public ModelAndView addDrug(
            @RequestParam(value = "patientId", required = false) Integer patientId,
            @RequestParam(value = "drugName", required = false) String drugName
    )
    {
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Hello Drugs");
        PatientDrugs drugs =new PatientDrugs();
        drugs.setPatientId(patientId);
        drugs.setDrugName(drugName);

        patientDrugsService.insertPatientDrug(drugs);

        model.setViewName("patientdrugs");

        return model;


    }

    @RequestMapping("/drugs")
    public ModelAndView displayDrugs(){
        ModelAndView model = new ModelAndView();
        List<PatientDrugs> drugList=patientDrugsService.getPatientDrugsList();
        model.addObject("drugList", drugList);
        model.setViewName("patientdrugs");
        return model;
    }
*/
    @RequestMapping("/patients")
    public ModelAndView displayPatients(){
        ModelAndView model = new ModelAndView();
        List<PatientDetails> patientList=patientDetailsService.getPatientList();
        model.addObject("patientList", patientList);

        model.setViewName("patientdetials");
        return model;
    }




}
