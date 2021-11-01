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

import com.sonata.Model.Slot;
import com.sonata.Repository.SlotRepository;

@RestController
public class SlotController {
 
	  Optional<Slot>s1;
	  
	  @Autowired
	  private SlotRepository prepository;
	  
	  @GetMapping("/slots")
	  public List<Slot>getAllSlots(){
		  return prepository.findAll();
	  }
	  
	  @GetMapping("/slots/{id}")
	  public ResponseEntity getSlotssById(@PathVariable(value="id") Long drId) {
		  s1 = prepository.findById(drId);
		  return ResponseEntity.ok().body(s1);
	  }
	  
	  @PostMapping(value = "/slots")
	  public Slot saveSlot(@RequestBody Slot slt) {
		  return prepository.save(slt);
	  }
	  
	  @PutMapping(value="/slots/{id}")
	  public ResponseEntity updateSlot(@PathVariable(value="id") Long drId,@Validated @RequestBody Slot sltdata) {
	   s1 = prepository.findById(drId);
	   Slot s2 = s1.get();
	  s2.setDrId(sltdata.getDrId());
	  s2.setPatId(sltdata.getPatId());
	  s2.setDisId(sltdata.getDisId());
	  s2.setDate(sltdata.getDate());
	  s2.setStarttime(sltdata.getStarttime());
	  s2.setEndtime(sltdata.getEndtime());
	  s2.setSlotId(sltdata.getSlotId());
	  
	  
	  Slot updateSlot = prepository.save(s2);
	  return ResponseEntity.ok(updateSlot);
	  }
	  
	  @DeleteMapping(value="/slots/{id}")
	  public ResponseEntity deleteSlot(@PathVariable(value="id")Long drId) {
		  prepository.deleteById(drId);
		  return ResponseEntity.noContent().build();
	  }
}