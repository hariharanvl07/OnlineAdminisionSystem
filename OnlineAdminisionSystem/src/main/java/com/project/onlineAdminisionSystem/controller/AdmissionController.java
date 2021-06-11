package com.project.onlineAdminisionSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.Admission;
import com.project.onlineAdminisionSystem.service.AdmissionService;

@RestController
@RequestMapping("/admission")
public class AdmissionController {
	@Autowired
	private AdmissionService service;
	
	@PostMapping("/addAdmission")
	public Admission addAdmission(@RequestBody Admission admission) {
		return service.addAdmission(admission);
	}
	@DeleteMapping("/deleteAdmission/{id}")
	public void deleteAdmissionById(@PathVariable("id") int admissionId) {
		service.deleteAdmissionById(admissionId);
	}
	@PutMapping("/updateAdmission/{id}")
	public ResponseEntity<Admission> updateAdmission(Admission admission){
		Admission admission1 = service.getAdmissionbyId(admission.getAdmissionId()).orElseThrow();
		admission1.setAdmissionStatus(admission.getAdmissionStatus());
		
		
		Admission updatedAdmissionStatus = service.updateAdmission(admission1);
		return ResponseEntity.ok(updatedAdmissionStatus);
	}
	@GetMapping("/getAdmissionById/{id}")
	public Optional<Admission> getAdmissionbyId(@PathVariable("id")int admissionId){
		Optional<Admission> test = service.getAdmissionbyId(admissionId);
		return test;
	}
	@GetMapping("/viewAllAdmissions")
	public List<Admission>viewAllAdmissions(){
		List<Admission> test = service.viewAllAdmissions();
		return test;
	}

}
