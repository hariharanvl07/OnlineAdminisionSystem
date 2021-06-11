package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.University;
import com.project.onlineAdminisionSystem.repository.IUniversityRepository;
@Service
class UniversityServiceImpl implements IUniversityService{

@Autowired
private IUniversityRepository repo;
	


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
		// TODO Auto-generated method stub
	repo.deleteById(universityId);	
	}

	@Override
	public University updateUniversity(University university) {
		// TODO Auto-generated method stub
		University uni = repo.findById(university.getUniversityId()).orElseThrow();
		uni.setName(uni.getName());
		uni.setAddress(university.getAddress());
		uni.setCollgeList(university.getCollgeList());

		
		return repo.save(uni);
	}

	@Override
	public Optional<University> getUniversityDetailsById(int universityId) {
		// TODO Auto-generated method stub
		return repo.findById(universityId);
	}
	
	
	
	
}