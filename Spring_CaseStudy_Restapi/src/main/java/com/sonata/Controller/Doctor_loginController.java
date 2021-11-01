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

import com.sonata.Model.Doctor_login;
import com.sonata.Repository.Doctor_loginRepository;

@RestController
public class Doctor_loginController {

	 Optional<Doctor_login>dl1;
	  
	  @Autowired
	  private Doctor_loginRepository prepository;
	  
	  @GetMapping("/doctor_logins")
	  public List<Doctor_login>getAllDoctor_logins(){
		  return prepository.findAll();
	  }
	  
	  @GetMapping("/doctor_logins/{id}")
	  public ResponseEntity getDoctor_loginById(@PathVariable(value="id") Long drId) {
		  dl1 = prepository.findById(drId);
		  return ResponseEntity.ok().body(dl1);
	  }
	  
	  @PostMapping(value = "/doctor_logins")
	  public Doctor_login saveDoctor_login(@RequestBody Doctor_login doclog) {
		  return prepository.save(doclog);
	  }
	  
	  @PutMapping(value="/doctor_logins/{id}")
	  public ResponseEntity updateDoctor_login(@PathVariable(value="id") Long drId,@Validated @RequestBody Doctor_login doclogdata) {
	   dl1 = prepository.findById(drId);
	   Doctor_login dl2 = dl1.get();
	  dl2.setDrId(doclogdata.getDrId());
	  dl2.setPassword(doclogdata.getPassword());
	
	  
	  Doctor_login updateDoctor_login = prepository.save(dl2);
	  return ResponseEntity.ok(updateDoctor_login);
	  }
	  
	  @DeleteMapping(value="/doctor_logins/{id}")
	  public ResponseEntity deleteDoctor_login(@PathVariable(value="id")Long drId) {
		  prepository.deleteById(drId);
		  return ResponseEntity.noContent().build();
	  }

}
