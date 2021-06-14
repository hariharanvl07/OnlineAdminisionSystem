package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.repository.ICollegeRepository;
@Service
class CollegeSericeImpl implements ICollegeService{
	Logger logger = LoggerFactory.getLogger(ICollegeService.class);
@Autowired
private ICollegeRepository repo;




@Override
	public College addCollege(College college) {

	logger.info("addCollege service started");
	logger.info("addCollege service ended");

		return repo.save(college);
	}

	@Override
	public List<College> viewAllCollegeDetails() {

		logger.info("getAllColleges service started");
		logger.info("getAllColleges service ended");
		return repo.findAll();
	}

	@Override
	public void deleteCollegeById(int collegeId) {

		logger.info("deleteCollegeById service started");
		
		repo.deleteById(collegeId);	
		logger.info("deleteCollegeById service ended");
	}

	@Override
	public College updateCollegeDetails(College college) {
		logger.info("updateCollege service started");
		College clg = repo.findById(college.getCollegeRegId()).orElseThrow();
		
		clg.setCollegeAddress(college.getCollegeAddress());
		clg.setCollegeName(college.getCollegeName());
		clg.setCourseList(college.getCourseList());
		clg.setProgramList(college.getProgramList());
		
		logger.info("updateCollege service ended");
		return repo.save(clg);
	}

	@Override
	public Optional<College> getCollegeDetailsById(int collegeId) {
		logger.info("getCollegeById service Started");
		logger.info("getCollegeById service ended");
		return repo.findById(collegeId);
	}

	@Override
	public Optional<College> getCollegeDetailsByName(String collegeName) {
		logger.info("getCollegeByName service Started");
		logger.info("getCollegeByName service ended");
		return repo.findBycollegeName(collegeName);
	}

	@Override
	public List<College> getCollegeByProgramName(List<Integer> id) {
		logger.info("getCollegeByProgram service Started");
		
	List<Integer>list = id;
	List<College> clgList = new ArrayList<College>();
	for (int i = 0; i < list.size(); i++) {
        
	 College college=repo.findById(list.get(i)).orElseThrow();
	
	clgList.add(college);
    
	college=null;
	}
	logger.info("getCollegeByProgram service ended");	
	return clgList;
	}

	@Override
	public void deleteCollegeByName(String collegeName) {
		logger.info("deleteCollegeByName service started");
		
		College clg = repo.findBycollegeName(collegeName).orElseThrow();
		
		repo.deleteById(clg.getCollegeRegId());
		logger.info("deleteCollegeByName service ended");
	}

	@Override
	public List<College> getCollegeByuniversityName(String universityName) {
		logger.info("getCollegeByuniversityName service started");
		logger.info("getCollegeByuniversityName service ended");
		return repo.findByuniversityName(universityName);
	}

	
	
	
	
	
}