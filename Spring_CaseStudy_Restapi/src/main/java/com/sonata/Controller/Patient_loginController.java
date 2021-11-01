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

import com.sonata.Model.Patient_login;
import com.sonata.Repository.Patient_loginRepository;

@RestController
public class Patient_loginController {

	 Optional<Patient_login>pl1;
	  
	  @Autowired
	  private Patient_loginRepository prepository;
	  
	  @GetMapping("/patient_logins")
	  public List<Patient_login>getAllPatient_logins(){
		  return prepository.findAll();
	  }
	  
	  @GetMapping("/patient_logins/{id}")
	  public ResponseEntity getPatient_loginById(@PathVariable(value="id") Long patId) {
		  pl1 = prepository.findById(patId);
		  return ResponseEntity.ok().body(pl1);
	  }
	  
	  @PostMapping(value = "/patient_logins")
	  public Patient_login savePatient_login(@RequestBody Patient_login patlog) {
		  return prepository.save(patlog);
	  }
	  
	  @PutMapping(value="/patient_logins/{id}")
	  public ResponseEntity updatePatient_login(@PathVariable(value="id") Long patId,@Validated @RequestBody Patient_login patlogdata) {
	   pl1 = prepository.findById(patId);
	   Patient_login pl2 = pl1.get();
	  pl2.setPatId(patlogdata.getPatId());
	  pl2.setPassword(patlogdata.getPassword());
	
	  
	  Patient_login updatePatient_login = prepository.save(pl2);
	  return ResponseEntity.ok(updatePatient_login);
	  }
	  
	  @DeleteMapping(value="/patient_logins/{id}")
	  public ResponseEntity deletePatient_login(@PathVariable(value="id")Long patId) {
		  prepository.deleteById(patId);
		  return ResponseEntity.noContent().build();
	  }

}






