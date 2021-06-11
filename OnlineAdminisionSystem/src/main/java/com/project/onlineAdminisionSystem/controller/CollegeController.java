package com.project.onlineAdminisionSystem.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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


@RestController
@RequestMapping("/college")

public class CollegeController {
	@Autowired
	private ICollegeService service;
	
	@Autowired
	private IProgramService progService;


	@PostMapping("/addCollege")
	public College addCollege(@RequestBody College college) {

		return service.addCollege(college);
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
