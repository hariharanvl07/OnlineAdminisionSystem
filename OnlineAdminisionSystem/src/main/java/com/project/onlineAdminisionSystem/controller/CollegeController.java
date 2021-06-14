package com.project.onlineAdminisionSystem.controller;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.service.ICollegeService;
import com.project.onlineAdminisionSystem.service.IProgramService;
import com.project.onlineAdminisionSystem.service.IUniversityService;


@RestController
@RequestMapping("/college")

public class CollegeController {

	Logger logger = LoggerFactory.getLogger(CollegeController.class);
	
	@Autowired
	private ICollegeService service;
	
	@Autowired
	private IUniversityService uniserv;
	
	@Autowired
	private IProgramService progService;


	@PostMapping("/addCollege")
	public College addCollege(@RequestBody College college) {
			
		
logger.info("addCollege controller started");
logger.info("addCollege controller ended");

		
		return service.addCollege(college);
	}
	
	
	@PostMapping("/updateCollege/{id}")
	public College updateCollege(@PathVariable("id")int id,@RequestBody College college) {
	College clg= service.getCollegeDetailsById(id).orElseThrow();
	clg.setCollegeName(college.getCollegeName());
	clg.setBranchList(college.getBranchList());
	clg.setCollegeAddress(college.getCollegeAddress());
	clg.setCourseList(college.getCourseList());
	clg.setProgramList(college.getProgramList());
	clg.setUniversity(college.getUniversity());
		

		
		
		return service.addCollege(clg);
	}
	
	@DeleteMapping("/deleteCollege/{id}")
	public void deleteCollegeById(@PathVariable("id") int id) {
		service.deleteCollegeById(id);
	}
	
	
	@DeleteMapping("/deleteCollegeByName/{collegeName}")
	public void deleteCollegeByName(@PathVariable("collegeName") String name) {
		service.deleteCollegeByName(name);
	}
	
@GetMapping("/getAllColleges")
public List<College> getAllColleges() {

	return service.viewAllCollegeDetails();
}


@GetMapping("/getCollegeById/{id}")
public College getAllColleges(@Param("id" )int id) {

	return service.getCollegeDetailsById(id).orElseThrow();
}

@GetMapping("/getCollegeByName/{collegeName}")
public Optional<College> getCollegeByName(@PathVariable("collegeName") String name) {

	return service.getCollegeDetailsByName(name);
}


@GetMapping("/getCollegeByProgramName/{programName}")
public List<College> getCollegeByProgramName(@PathVariable("programName") String pname) {

	List<Integer> id= progService.getCollegeIdByProgramName(pname);
List<College> college = service.getCollegeByProgramName(id);
return college;
}
}
