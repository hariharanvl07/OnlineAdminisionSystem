package com.project.onlineAdminisionSystem.service;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.entity.University;
import com.project.onlineAdminisionSystem.repository.IUniversityRepository;
@Service
class UniversityServiceImpl implements IUniversityService{
	Logger logger = LoggerFactory.getLogger(IUniversityService.class);

@Autowired
private IUniversityRepository repo;
	
@Autowired 
private ICollegeService service;

@Override
	public University addUniversity(University university) {
	
	logger.info("addUniversity service started");
	logger.info("addUniversity service ended");
	
		return repo.save(university);
	}

	@Override
	public List<University> viewAllUniversityDetails() {
		
		logger.info("getAllUniversitys service started");
		logger.info("getAllUniversitys service ended");
		
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteUniversityById(int universityId) {
		
		logger.info("deleteUniversityById service started");
		repo.deleteById(universityId);	
		logger.info("deleteUniversityById service ended");
	}

	@Override
	public University updateUniversity(University university) {
		
		logger.info("updateUniversity service started");
	
		University uni = repo.findById(university.getUniversityId()).orElseThrow();
		uni.setName(uni.getName());
		uni.setAddress(university.getAddress());
		uni.setCollegeList(university.getCollegeList());

		logger.info("updateUniversity service ended");
		return repo.save(uni);
	}

	@Override
	public Optional<University> getUniversityDetailsById(int universityId) {
		
		logger.info("getUniversityDetailsById service Started");
		logger.info("getUniversityDetailsById service ended");
		// TODO Auto-generated method stub
		return repo.findById(universityId);
	}

	@Override
	public Optional<University> getUniversityByName(String uname) {
		
		logger.info("getUniversityByName service Started");
		logger.info("getUniversityByName service ended");
	
		return repo.findByname(uname);
	}



	 public University addCollegeToUniversity(String name) {
		 logger.info("addCollegeToUniversity service Started");
	
		
		List<College> collegeList = service.getCollegeByuniversityName(name);
		
		University uni = repo.findByname(name).orElseThrow();
		
		uni.setCollegeList(collegeList);
		
		logger.info("addCollegeToUniversityservice ended");	
		
		return uni;

		
	}

	
	
	
	
}