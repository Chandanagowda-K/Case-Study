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

import com.sonata.Model.Diseases;
import com.sonata.Repository.DiseasesRepository;

@RestController
public class DiseasesController {

	 Optional<Diseases>di1;
	  
	  @Autowired
	  private DiseasesRepository prepository;
	  
	  @GetMapping("/diseases")
	  public List<Diseases>getAllDiseasess(){
		  return prepository.findAll();
	  }
	  
	  @GetMapping("/diseases/{id}")
	  public ResponseEntity getDiseasesById(@PathVariable(value="id") Long disId) {
		  di1 = prepository.findById(disId);
		  return ResponseEntity.ok().body(di1);
	  }
	  
	  @PostMapping(value = "/diseases")
	  public Diseases saveDiseases(@RequestBody Diseases dilog) {
		  return prepository.save(dilog);
	  }
	  
	  @PutMapping(value="/diseases/{id}")
	  public ResponseEntity updateDiseases(@PathVariable(value="id") Long disId,@Validated @RequestBody Diseases didata) {
	   di1 = prepository.findById(disId);
	   Diseases di2 = di1.get();
	  di2.setDisId(didata.getDisId());
	  di2.setDisname(didata.getDisname());
	
	  
	  Diseases updateDiseases = prepository.save(di2);
	  return ResponseEntity.ok(updateDiseases);
	  }
	  
	  @DeleteMapping(value="/diseases/{id}")
	  public ResponseEntity deleteDiseases(@PathVariable(value="id")Long disId) {
		  prepository.deleteById(disId);
		  return ResponseEntity.noContent().build();
	  }

}

