package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.entity.University;
import com.project.onlineAdminisionSystem.repository.IUniversityRepository;
@Service
class UniversityServiceImpl implements IUniversityService{

@Autowired
private IUniversityRepository repo;
	
@Autowired 
private ICollegeService service;

@Override
	public University addUniversity(University university) {
	
		return repo.save(university);
	}

	@Override
	public List<University> viewAllUniversityDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteUniversityById(int universityId) {
		
	repo.deleteById(universityId);	
	}

	@Override
	public University updateUniversity(University university) {
	
		University uni = repo.findById(university.getUniversityId()).orElseThrow();
		uni.setName(uni.getName());
		uni.setAddress(university.getAddress());
		uni.setCollegeList(university.getCollegeList());

		
		return repo.save(uni);
	}

	@Override
	public Optional<University> getUniversityDetailsById(int universityId) {
		// TODO Auto-generated method stub
		return repo.findById(universityId);
	}

	@Override
	public Optional<University> getUniversityByName(String uname) {
	
		return repo.findByname(uname);
	}



	 public University addCollegeToUniversity(String name) {
	
		
		List<College> collegeList = service.getCollegeByuniversityName(name);
		
		University uni = repo.findByname(name).orElseThrow();
		
		uni.setCollegeList(collegeList);
		
		return uni;

		
	}

	
	
	
	
}