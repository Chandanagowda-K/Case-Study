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

import com.sonata.Model.Patient;
import com.sonata.Repository.PatientRepository;

@RestController
public class PatientController {
 
	  Optional<Patient>p1;
	  
	  @Autowired
	  private PatientRepository prepository;
	  
	  @GetMapping("/patients")
	  public List<Patient>getAllPatients(){
		  return prepository.findAll();
	  }
	  
	  @GetMapping("/patients/{id}")
	  public ResponseEntity getPatientsById(@PathVariable(value="id") Long patId) {
		  p1 = prepository.findById(patId);
		  return ResponseEntity.ok().body(p1);
	  }
	  
	  @PostMapping(value = "/patients")
	  public Patient savePatient(@RequestBody Patient pat) {
		  return prepository.save(pat);
	  }
	  
	  @PutMapping(value="/patients/{id}")
	  public ResponseEntity updatePatient(@PathVariable(value="id") Long patId,@Validated @RequestBody Patient patdata) {
	   p1 = prepository.findById(patId);
	   Patient p2 = p1.get();
	  p2.setPatId(patdata.getPatId());
	  p2.setName(patdata.getName());
	  p2.setAge(patdata.getAge());
	  p2.setEmail(patdata.getEmail());
	  p2.setPhonenumber(patdata.getPhonenumber());
	  p2.setBloodgroup(patdata.getBloodgroup());
	  
	  
	  Patient updatePatient = prepository.save(p2);
	  return ResponseEntity.ok(updatePatient);
	  }
	  
	  @DeleteMapping(value="/patients/{id}")
	  public ResponseEntity deletePatient(@PathVariable(value="id")Long patId) {
		  prepository.deleteById(patId);
		  return ResponseEntity.noContent().build();
	  }
}
