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

import com.project.onlineAdminisionSystem.entity.University;
import com.project.onlineAdminisionSystem.service.IUniversityService;


@RestController
@RequestMapping("/university")

public class UniversityController {
	@Autowired
	private IUniversityService service;


	@PostMapping("/addUniversity")
	public University addUniversity(@RequestBody University university) {

		return service.addUniversity(university);
	}
	
	@DeleteMapping("/deleteUniversity/{id}")
	public void deleteUniversityById(@PathVariable("id") int id) {
		service.deleteUniversityById(id);
	}
	
@GetMapping("/getAllUniversitys")
public List<University> getAllUniversitys() {

	return service.viewAllUniversityDetails();
}
@GetMapping("/getUniversityDetailsById/{id}")
public Optional<University> getUniversityDetailsById(@PathVariable("id") int id) {

	return service.getUniversityDetailsById(id);
}
}