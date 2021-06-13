package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.entity.Program;
import com.project.onlineAdminisionSystem.repository.IProgramRepository;
@Service	
public class ProgramServiceImpl implements IProgramService{
@Autowired
private IProgramRepository repo;
Logger logger = LoggerFactory.getLogger(ProgramServiceImpl.class);
@Autowired 
private ICollegeService service;
	@Override
	public Program addProgram(Program program) {
		logger.info("addProgram service started");
		logger.info("addProgram service ended");
		return repo.save(program);
	}

	
	@Override
	public List<Program> viewAllProgramDetails() {
		logger.info("getAllPrograms service started");
		logger.info("getAllPrograms service ended");
		return repo.findAll();
	}

	@Override
	public ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName) {
	
		return null;
	}

	@Override
	public Optional<Program> getProgramDetailsByName(String programName) {
		logger.info("getProgramByName controller started");
		logger.info("getProgrambyName controller ended");
		return repo.findByprogramName(programName);
	}

	@Override
	
	public List<Program> getProgramByEligibility(String programEligibility) {
	
		return repo.findByprogramEligibility(programEligibility);
	}

	@Override
	public void deleteByprogramId(int programId) {

		repo.deleteById(programId);
	}

	@Override
	public void deleteProgramByName(String programName) {

		repo.deleteByprogramName(programName);
	}

	@Override
	public Optional<Program> getProgramById(int programId) {
	
		return repo.findById(programId);
	}

	@Override
	public Program updateProgramStatus(Program program) {
		Program program1 = repo.findById(program.getProgramId()).orElseThrow();
		program1.setDegreeOffered(program.getDegreeOffered());
		program1.setProgramDescription(program.getProgramDescription());
		program1.setProgramDuration(program.getProgramDuration());
		program1.setProgramEligibility(program.getProgramEligibility());
		program1.setProgramName(program.getProgramName());
		
		return repo.save(program1);
	}





	@Override
	public List<Program> getProgramsByCollegeId(int collegeId) {

		return repo.findByCollegeId(collegeId);
	}


	@Override
	public List<Integer> getCollegeIdByProgramName(String programName) {
	
		return repo.findCollegeByProgramName(programName);
	}


	@Override
	public List<Program> getProgramsByCollegeName(String name) {
	College college = service.getCollegeDetailsByName(name).orElseThrow();
	List<Program> program = repo.findByCollegeId(college.getCollegeRegId());
		return program;
	}

}
