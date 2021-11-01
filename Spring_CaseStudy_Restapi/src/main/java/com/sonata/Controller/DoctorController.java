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

import com.sonata.Model.Doctor;
import com.sonata.Repository.DoctorRepository;

@RestController
public class DoctorController {
 
	  Optional<Doctor>d1;
	  
	  @Autowired
	  private DoctorRepository prepository;
	  
	  @GetMapping("/doctors")
	  public List<Doctor>getAllDoctors(){
		  return prepository.findAll();
	  }
	  
	  @GetMapping("/doctors/{id}")
	  public ResponseEntity getDoctorsById(@PathVariable(value="id") Long drId) {
		  d1 = prepository.findById(drId);
		  return ResponseEntity.ok().body(d1);
	  }
	  
	  @PostMapping(value = "/doctors")
	  public Doctor saveProduct(@RequestBody Doctor dr) {
		  return prepository.save(dr);
	  }
	  
	  @PutMapping(value="/doctors/{id}")
	  public ResponseEntity updateDoctor(@PathVariable(value="id") Long drId,@Validated @RequestBody Doctor drdata) {
	   d1 = prepository.findById(drId);
	   Doctor d2 = d1.get();
	  d2.setDrId(drdata.getDrId());
	  d2.setDrName(drdata.getDrName());
	  d2.setSpecialization(drdata.getSpecialization());
	  d2.setEmail(drdata.getEmail());
	  d2.setPhonenumber(drdata.getPhonenumber());
	  
	  Doctor updateDoctor = prepository.save(d2);
	  return ResponseEntity.ok(updateDoctor);
	  }
	  
	  @DeleteMapping(value="/doctors/{id}")
	  public ResponseEntity deleteDoctor(@PathVariable(value="id")Long drId) {
		  prepository.deleteById(drId);
		  return ResponseEntity.noContent().build();
	  }
}
	  