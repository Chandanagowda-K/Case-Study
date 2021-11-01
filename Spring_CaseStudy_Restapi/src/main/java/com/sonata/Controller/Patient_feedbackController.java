package com.sonata.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Patient_feedback;
import com.sonata.Repository.Patient_feedbackRepository;

@RestController
public class Patient_feedbackController {

	 Optional<Patient_feedback>pf1;
	  
	  @Autowired
	  private Patient_feedbackRepository prepository;
	  
	  @GetMapping("/patient_feedbacks")
	  public List<Patient_feedback>getAllPatient_feedbacks(){
		  return prepository.findAll();
	  }
	  
	  @GetMapping("/patient_feedbacks/{id}")
	  public ResponseEntity getPatient_feedbackById(@PathVariable(value="id") Long drId) {
		  pf1 = prepository.findById(drId);
		  return ResponseEntity.ok().body(pf1);
	  }
	  
	  @PostMapping(value = "/patient_feedbacks")
	  public Patient_feedback savePatient_feedback(@RequestBody Patient_feedback paflog) {
		  return prepository.save(paflog);
	  }
	  
	  @PutMapping(value="/patient_feedbacks/{id}")
	  public ResponseEntity updatePatient_feedback(@PathVariable(value="id") Long drId,@Validated @RequestBody Patient_feedback pafdata) {
	   pf1 = prepository.findById(drId);
	   Patient_feedback pf2 = pf1.get();
	   pf2.setDrId(pafdata.getDrId());
	  pf2.setPatId(pafdata.getPatId());
	  pf2.setFeedback(pafdata.getFeedback());
	  pf2.setFeedbackId(pafdata.getFeedbackId());
	  pf2.setDateTime(pafdata.getDateTime());
	  
	  Patient_feedback updatePatient_feedback = prepository.save(pf2);
	  return ResponseEntity.ok(updatePatient_feedback);
	  }
	  
	  @DeleteMapping(value="/patient_feedbacks/{id}")
	  public ResponseEntity deletePatient_feedback(@PathVariable(value="id")Long drId) {
		  prepository.deleteById(drId);
		  return ResponseEntity.noContent().build();
	  }

}

