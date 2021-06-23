package com.project.onlineAdminisionSystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/application")

public class ApplicationController {
	
	Logger logger = LoggerFactory.getLogger(ApplicationController.class);

	@Autowired
	private IApplicationService service;
	
	@PostMapping("/addApplication")
	public Application addApplication(@RequestBody Application application) {
		
		logger.info("addApplication controller started");
		logger.info("addApplication controller ended");
		
		return service.addApplication(application);
	}
	
	@DeleteMapping("/deleteApplication/{id}")
	public void deleteApplicationById(@PathVariable("id") int id) {
		
		logger.info("deleteApplicationById service started");
		service.deleteApplicationById(id);
		logger.info("deleteApplicationById service ended");
		
	}
	@DeleteMapping("/deleteApplicationByEmailId/{emailId}")
	public void deleteApplicationByEmailId(@PathVariable("emailId") String emailId) {
		
		logger.info("deleteApplicationByEmailId service started");
		
		service.deleteApplicationByEmailId(emailId);
		
		logger.info("deleteApplicationByEmailId service ended");
	}
	@GetMapping("/viewAllApplication")
	public List<Application> viewAllApplication(){
		
		logger.info("viewAllApplicationDetails service started");
		logger.info("viewAllApplicationDetails service ended");
		return service.viewAllApplicationDetails();
		
	}
	@GetMapping("/getApplicationById/{applicationId}")
	public Application getApplicationById(@PathVariable("applicationId") int id){
		
		logger.info("getApplicationById service started");
		logger.info("getApplicationById service ended");
		
		return service.getApplicationById(id);
	}
	@GetMapping("/getApplicationByEmailId/{emailId}")
	public Application getApplicationByEmailId(@PathVariable("emailId") String mail){
		
		logger.info("getApplicationDetailsByEmailId service started");
		logger.info("getApplicationDetailsByEmailId service ended");
		
		return service.viewAllApplicationDetailsByMail(mail);
	}
	@GetMapping("/getAllApplicationByApplicationStatus/{applicationStatus}")
	public List<Application> getAllApplicationByApplicationStatus(@PathVariable("applicationStatus") String status){
		
		logger.info("getApplicationDetailsByStatus service started");
		logger.info("getApplicationDetailsByStatus service ended");
		
		return service.viewAllApplicationDetails(status);
	}
	@GetMapping("/getAllApplicationByStudentId/{StudentId}")
	public List<Application> getAllApplicationByStudentId(@PathVariable("StudentId") int id){
		
		logger.info("getAllApplicationByStudentId service started");
		logger.info("getAllApplicationByStudentId service ended");
		
		return service.getAllApplicationByStudentId(id);
	}
	@PutMapping("/updateApplicationStatus/{applicationId}")
	public Application updateApplication(@PathVariable("applicationId")int id,@RequestBody Application application) {
		
		logger.info("updateApplicationStatus service started");
		Application sts= service.getApplicationById(id);
		sts.setApplicationStatus(application.getApplicationStatus());
		sts.setPayment(application.getPayment());
		logger.info("updateApplicationStatus service ended");
		
		return service.updateApplicationStatus(application);
	}
	

}	