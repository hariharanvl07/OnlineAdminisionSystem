package com.project.onlineAdminisionSystem.controller;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.onlineAdminisionSystem.entity.University;
import com.project.onlineAdminisionSystem.service.IUniversityService;


@RestController
@RequestMapping("/university")

public class UniversityController {
	
	Logger logger = LoggerFactory.getLogger(UniversityController.class);
	
	@Autowired
	private IUniversityService service;


	@PostMapping("/addUniversity")
	public University addUniversity(@RequestBody University university) {
		
logger.info("addUniversity controller started");
logger.info("addUniversity controller ended");
		

		return service.addUniversity(university);
	}
	
	
	@PostMapping("/updateUniversity/{id}")
	public University updateUniversity(@PathVariable("id")int id,@RequestBody University university) {
		logger.info("updateUniversity controller started");
		University uni = service.getUniversityDetailsById(id).orElseThrow();
	uni.setName(uni.getName());
	uni.setAddress(university.getAddress());
	uni.setCollegeList(university.getCollegeList());
	
	logger.info("updateUniversity controller ended");
	
	
		
		
		return service.addUniversity(uni);
	}
	
	@DeleteMapping("/deleteUniversity/{id}")
	public void deleteUniversityById(@PathVariable("id") int id) {
		logger.info("deleteUniversity controller started");
		service.deleteUniversityById(id);
		logger.info("deleteUniversity controller ended");
	}
	
@GetMapping("/getAllUniversitys")
public List<University> getAllUniversitys() {
	logger.info("getAllUniversity controller started");
	logger.info("getAllUniversity controller ended");

	return service.viewAllUniversityDetails();
}
@GetMapping("/getUniversityDetailsById/{id}")
public Optional<University> getUniversityDetailsById(@PathVariable("id") int id) {
	logger.info("getUniversityById controller started");
	logger.info("getUniversityDetailsById controller ended");

	return service.getUniversityDetailsById(id);
}

@GetMapping("/getUniversityByName/{collegeName}")
public Optional<University> getUniversityByName(@PathVariable("uname") String name) {
	logger.info("getUniversityByName controller started");
	logger.info("getUniversityByName controller ended");
	return service.getUniversityByName(name);
}
}