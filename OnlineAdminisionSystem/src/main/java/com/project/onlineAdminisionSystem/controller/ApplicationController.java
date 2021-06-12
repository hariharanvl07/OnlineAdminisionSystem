package com.project.onlineAdminisionSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.Application;
import com.project.onlineAdminisionSystem.service.IApplicationService;

@RestController
@RequestMapping("/application")

public class ApplicationController {

	@Autowired
	private IApplicationService service;
	
	@PostMapping("/addApplication")
	public Application addApplication(@RequestBody Application application) {
		return service.addApplication(application);
	}
	
	@DeleteMapping("/deleteApplication/{id}")
	public void deleteApplicationById(@PathVariable("id") int id) {
		service.deleteApplicationById(id);
	}
	@DeleteMapping("/deleteApplicationByEmailId/{emailId}")
	public void deleteApplicationByEmailId(@PathVariable("emailId") String emailId) {
		service.deleteApplicationByEmailId(emailId);
	}
	@GetMapping("/getAllApplication")
	public List<Application> getAllApplication(){
		return service.viewAllApplicationDetails();
		
	}
	@GetMapping("/getApplicationById/{applicationId}")
	public Application getApplicationById(@PathVariable("applicationId") int id){
		return service.getApplicationById(id);
	}
	@GetMapping("/getAllApplicationByEmailId/{emailId}")
	public List<Application> getAllApplicationByemailId(@PathVariable("emailId") String mail){
		return service.viewAllApplicationDetails(mail);
	}
	@GetMapping("/getAllApplicationByApplicationStatus/{applicationStatus}")
	public List<Application> getAllApplicationByApplicationStatus(@PathVariable("applicationStatus") String status){
		return service.viewAllApplicationDetails(status);
	}
	@PutMapping("/updateApplicationStatus/{applicationId}")
	public Application updateApplication(@PathVariable("applicationId")int id,@RequestBody Application application) {
		Application sts= service.getApplicationById(id);
		sts.setApplicationStatus(application.getApplicationStatus());
		return service.addApplication(application);
	}
}	