package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Application;

@Repository
public interface IApplicationRepository extends JpaRepository<Application , Integer>{

	ArrayList<Application> findByemailId(String emailId);

	ArrayList<Application> findByapplicationStatus(String status);

	void deleteApplicationByEmailId(String emailId);



	
	

}