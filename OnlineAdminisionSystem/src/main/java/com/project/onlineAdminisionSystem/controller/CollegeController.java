package com.project.onlineAdminisionSystem.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.service.ICollegeService;


@RestController
@RequestMapping("/college")

public class CollegeController {
	@Autowired
	private ICollegeService service;


	@PostMapping("/addCollege")
	public College addCollege(@RequestBody College college) {

		return service.addCollege(college);
	}
	
	
	
@GetMapping("/getAllColleges")
public List<College> getAllColleges() {

	return service.viewAllCollegeDetails();
}

}
