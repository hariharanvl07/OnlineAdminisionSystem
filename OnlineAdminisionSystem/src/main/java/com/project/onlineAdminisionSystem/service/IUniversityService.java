package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.entity.University;

public interface IUniversityService
{
	public University addUniversity(University university);
	public List<University> viewAllUniversityDetails();


	public void deleteUniversityById(int universityId);

	public University  updateUniversity(University university);
	public  Optional<University> getUniversityDetailsById(int universityId);
	
	Optional<University> getUniversityByName(String uname) ;
	 University addCollegeToUniversity(String name);
	
}
