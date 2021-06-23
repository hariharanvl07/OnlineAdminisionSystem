package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Application;

@Repository
public interface IApplicationRepository extends JpaRepository<Application , Integer>{

   Application findByemailId(String emailId);

	ArrayList<Application> findByapplicationStatus(String status);

	void deleteApplicationByEmailId(String emailId);
	@Query(value="SELECT * FROM application WHERE stuent_id= :studentId ;",nativeQuery=true)
	List<Application> finApplicationByStudenyId(@Param("studentId")int id);



	
	

}