package com.project.onlineAdminisionSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlineAdminisionSystem.entity.University;

public interface IUniversityRepository extends JpaRepository<University, Integer>{
	
}

	


/*public interface IUniversityRepository
{
	public University addUniversity(University university);
	public ArrayList<University> viewAllUniversityDetails();
	public  ArrayList<University> getUniversityDetailsByCity(String city);
	public  ArrayList<University> getUniversityDetailsBycollegeName
	(String collegeName);
	public int deleteUniversityById(int universityId);
	public University getUniversityById(int applicationId);
	public int  updateUniversity(University university);
	//can add more funtion if require as per business logic
	public University save(University university);
	public List<University> findAll();
	public Optional<University> findById(int universityId);
} */
