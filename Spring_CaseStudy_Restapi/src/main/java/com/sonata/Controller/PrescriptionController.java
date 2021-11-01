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


import com.sonata.Model.Prescription;
import com.sonata.Repository.Patient_loginRepository;
import com.sonata.Repository.PrescriptionRepository;

@RestController

public class PrescriptionController {

	 Optional<Prescription>pe1;
	  
	  @Autowired
	  private PrescriptionRepository prepository;
	  
	  @GetMapping("/prescriptions")
	  public List<Prescription>getAllPrescriptions(){
		  return prepository.findAll();
	  }
	  
	  @GetMapping("/prescriptions/{id}")
	  public ResponseEntity getPrescriptionById(@PathVariable(value="id") Long slotId) {
		  pe1 = prepository.findById(slotId);
		  return ResponseEntity.ok().body(pe1);
	  }
	  
	  @PostMapping(value = "/prescriptions")
	  public Prescription savePrescription(@RequestBody Prescription prelog) {
		  return prepository.save(prelog);
	  }
	  
	  @PutMapping(value="/prescription/{id}")
	  public ResponseEntity updatePrescription(@PathVariable(value="id") Long slotId,@Validated @RequestBody Prescription predata) {
	   pe1 = prepository.findById(slotId);
	   Prescription pe2 = pe1.get();
	  pe2.setSlotId(predata.getSlotId());
	  pe2.setPrescription(predata.getPrescription());
	
	  
	  Prescription updatePrescription = prepository.save(pe2);
	  return ResponseEntity.ok(updatePrescription);
	  }
	  
	  @DeleteMapping(value="/prescription/{id}")
	  public ResponseEntity deletePrescription(@PathVariable(value="id")Long slotId) {
		  prepository.deleteById(slotId);
		  return ResponseEntity.noContent().build();
	  }

}



