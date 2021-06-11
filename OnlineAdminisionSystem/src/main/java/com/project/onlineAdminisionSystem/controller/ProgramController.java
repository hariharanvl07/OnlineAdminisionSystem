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
import com.project.onlineAdminisionSystem.entity.Program;
import com.project.onlineAdminisionSystem.service.ICollegeService;
import com.project.onlineAdminisionSystem.service.IProgramService;


@RestController
@RequestMapping("/program")

public class ProgramController {
	@Autowired
	private IProgramService service;
	@Autowired
	private ICollegeService clgService;


	@PostMapping("/addProgram")
	public Program addProgram(@RequestBody Program program) {

		return service.addProgram(program);
	}
	
	@DeleteMapping("/deleteProgram/{id}")
	public void deleteProgramById(@PathVariable("id") int id) {
		service.deleteByprogramId(id);
	}
	
@GetMapping("/getAllPrograms")
public List<Program> getAllPrograms() {

	return service.viewAllProgramDetails();
}
@GetMapping("/getProgramByName/{programName}")
public Optional<Program> getProgramByName(@PathVariable("programName") String name) {

	return service.getProgramDetailsByName(name);
}

@GetMapping("/getProgramByCollegeName/{collegeName}")
public List<Program> getProgramByCollegeName(@PathVariable("collegeName") String collegeName) {

	return service.getProgramsByCollegeName(collegeName);
}

@GetMapping("/getProgrameByCollegeId/{id}")
public List<Program> getProgramByName(@PathVariable("id") int id) {

	return service.getProgramsByCollegeId(id);
}

@GetMapping("/getCollegeIdByProgramName/{programName}")
public List<Integer> getCollegeIdByProgramName(@PathVariable("programName") String pname) {

	return service.getCollegeByProgramName(pname);
}
@GetMapping("/getCollegeByProgramName/{programName}")
public List<College> getCollegeByProgramName(@PathVariable("programName") String pname) {

	List<Integer> id= service.getCollegeByProgramName(pname);
List<College> college = clgService.getCollegeByProgramName(id);
return college;
}


}
