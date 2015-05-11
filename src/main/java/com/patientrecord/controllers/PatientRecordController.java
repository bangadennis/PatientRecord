package com.patientrecord.controllers;


import com.patientrecord.models.PatientDetails;
import com.patientrecord.models.PatientDrugs;
import com.patientrecord.services.PatientDetailsService;
import com.patientrecord.services.PatientDrugsService;
import org.apache.commons.lang.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by banga on 5/7/15.
 */
@Controller
public class PatientRecordController {
    @Autowired
    private PatientDetailsService patientDetailsService;
    @Autowired
    private PatientDrugsService patientDrugsService;

    @RequestMapping("/patients")
    public String patientsform(Model model)
    {
        model.addAttribute("msg","Add Patients");
        return "patientdetails";
    }


    @RequestMapping("/drugs")
    public String drugsform(Model model)
    {
        List<PatientDetails> patientList=patientDetailsService.getPatientList();
        model.addAttribute("data",patientList);
        model.addAttribute("msg","Add Patient's Drugs");
        return "patientdrugs";
    }

    @RequestMapping("/addpatient")
    public ModelAndView addPatient(@RequestParam(value = "fname", required = true) String fname,
                                   @RequestParam(value = "lname", required = true) String lname,
                                   @RequestParam(value = "dateofbirth", required = true) String dateofbirth )
    {

        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Added Patient Successfully");
        PatientDetails patient = new PatientDetails();
        patient.setFname(fname);
        patient.setLname(lname);
        patient.setDateofbirth(dateofbirth);
        patientDetailsService.insertPatientRecord(patient);

        model.setViewName("patientdetails");
        return model;
    }

   @RequestMapping(value="/add")
    public ModelAndView addDrug(

            @RequestParam(value = "patientId", required = true) int patientId,
            @RequestParam(value = "drugName", required = true) String drugName
    )
    {
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Added Successfully");
        PatientDrugs drugs = new PatientDrugs();
        drugs.setPatient_id(patientId);
        drugs.setDrugName(drugName);
        patientDrugsService.insertPatientDrug(drugs);

        List<PatientDetails> patientList=patientDetailsService.getPatientList();
        model.addObject("patientList", patientList);

        model.setViewName("display");

        return model;

    }

    @RequestMapping(value="/add_drug", method= RequestMethod.GET )
    public ModelAndView addDrugMethod(
            @RequestParam(value = "id", required = true) int id
    )
    {
        ModelAndView model = new ModelAndView();
        model.addObject("id", id);
        model.setViewName("patientdrugs");
        return model;

    }
    @RequestMapping("/drugslist")
    public ModelAndView displayDrugs(){
        ModelAndView model = new ModelAndView();
        List<PatientDrugs> drugList=patientDrugsService.getPatientDrugsList();
        model.addObject("drugList", drugList);
        model.setViewName("display");
        return model;
    }

    @RequestMapping("/patientslist")
    public ModelAndView displayPatients(){
        ModelAndView model = new ModelAndView();
        List<PatientDetails> patientList=patientDetailsService.getPatientList();
        model.addObject("patientList", patientList);

        model.setViewName("display");
        return model;
    }




}
