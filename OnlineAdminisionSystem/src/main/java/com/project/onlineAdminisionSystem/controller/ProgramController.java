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

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.entity.Program;
import com.project.onlineAdminisionSystem.service.ICollegeService;
import com.project.onlineAdminisionSystem.service.IProgramService;


@RestController
@RequestMapping("/program")

public class ProgramController {
	
	Logger logger = LoggerFactory.getLogger(ProgramController.class);
	@Autowired
	private IProgramService service;
	@Autowired
	private ICollegeService clgService;


	@PostMapping("/addProgram")
	public Program addProgram(@RequestBody Program program) {
		logger.info("addProgram controller started");
		logger.info("addProgram controller ended");
		return service.addProgram(program);
	}
	
	@DeleteMapping("/deleteProgram/{id}")
	public void deleteProgramById(@PathVariable("id") int id) {
		logger.info("deleteProgram controller started");
		
		service.deleteByprogramId(id);
		logger.info("deleteProgram controller ended");
	}
	
@GetMapping("/getAllPrograms")
public List<Program> getAllPrograms() {
	logger.info("getAllPrograms controller started");
	logger.info("getAllPrograms controller ended");
	return service.viewAllProgramDetails();
}
@GetMapping("/getProgramByName/{programName}")
public Optional<Program> getProgramByName(@PathVariable("programName") String name) {
	logger.info("getProgramByName controller started");
	logger.info("getProgrambyName controller ended");
	return service.getProgramDetailsByName(name);
}

@GetMapping("/getProgramByCollegeName/{collegeName}")
public List<Program> getProgramByCollegeName(@PathVariable("collegeName") String collegeName) {
	logger.info("getProgramByCollegeName controller started");
	logger.info("getProgrambyCollegeName controller ended");
	return service.getProgramsByCollegeName(collegeName);
}

@GetMapping("/getProgrameByCollegeId/{id}")
public List<Program> getProgramById(@PathVariable("id") int id) {
	logger.info("getProgramById controller started");
	logger.info("getProgrambyId controller ended");
	return service.getProgramsByCollegeId(id);
}

@GetMapping("/getProgrameByEligiblity/{eligiblity}")
public List<Program> 0(@PathVariable("eligiblity") String eligiblity) {
	logger.info("getProgramById controller started");
	logger.info("getProgrambyId controller ended");
	return service.getProgrameByEligiblity(eligiblity);
}



@GetMapping("/getCollegeByProgramName/{programName}")
public List<College> getCollegeByProgramName(@PathVariable("programName") String pname) {
	logger.info("getCollegeByProgramName controller started");
	logger.info("getCollegeByProgramName controller ended");
	List<Integer> id= service.getCollegeIdByProgramName(pname);
List<College> college = clgService.getCollegeByProgramName(id);
return college;
}


}
