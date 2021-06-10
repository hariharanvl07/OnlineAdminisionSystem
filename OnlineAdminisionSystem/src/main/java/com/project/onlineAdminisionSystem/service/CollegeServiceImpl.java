package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.repository.ICollegeRepository;
@Service
class CollegeSericeImpl implements ICollegeService{

@Autowired
private ICollegeRepository repo;
	


@Override
	public College addCollege(College college) {
	
		return repo.save(college);
	}

	@Override
	public List<College> viewAllCollegeDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteCollegeById(int collegeId) {
		// TODO Auto-generated method stub
	repo.deleteById(collegeId);	
	}

	@Override
	public College updateCollegeDetails(College college) {
		// TODO Auto-generated method stub
		College clg = repo.findById(college.getCollegeRegId()).orElseThrow();
		/*clg.setBranchList(college.getBranchList());
		clg.setCollegeAddress(college.getCollegeAddress());*/
		clg.setCollegeName(college.getCollegeName());
		//clg.setCourseList(college.getCourseList());
		clg.setProgramList(college.getProgramList());
		
		
		return repo.save(clg);
	}

	@Override
	public Optional<College> getCollegeDetailsById(int collegeId) {
		// TODO Auto-generated method stub
		return repo.findById(collegeId);
	}

	@Override
	public Optional<College> getCollegeDetailsByName(String collegeName) {
		// TODO Auto-generated method stub
		return repo.findBycollegeName(collegeName);
	}

	@Override
	public List<College> getCollegeByProgramName(List<Integer> id) {
	List<Integer>list = id;
	List<College> clgList = new ArrayList<College>();
	for (int i = 0; i < list.size(); i++) {
        
	 College college=repo.findById(list.get(i)).orElseThrow();
	
	clgList.add(college);
    
	college=null;
	}
		return clgList;
	}
	
	
	
	
}