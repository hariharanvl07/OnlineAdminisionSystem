package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Application;
import com.project.onlineAdminisionSystem.repository.IApplicationRepository;

@Service
public class ApplicationServiceImpl implements IApplicationService {
	
	Logger logger = LoggerFactory.getLogger(IApplicationService.class);
	@Autowired
	private IApplicationRepository repo;

	@Override
	public Application addApplication(Application application) {
		
		logger.info("addApplication service started");
		logger.info("addApplication service ended");

		return repo.save(application);
	}

	@Override
	public List<Application> viewAllApplicationDetails() {
		
		logger.info("viewAllApplicationDetails service started");
		logger.info("viewAllApplicationDetails service ended");

		return repo.findAll();
	}

	@Override
	public ArrayList<Application> getApplicationDetailsByEmailId(String emailId) {
		
		logger.info("getApplicationDetailsByEmailId service started");
		logger.info("getApplicationDetailsByEmailId service ended");
		
		return repo.findByemailId(emailId);
	}

	@Override
	public ArrayList<Application> getApplicationDetailsByStatus(String status) {
		
		logger.info("getApplicationDetailsByStatus service started");
		logger.info("getApplicationDetailsByStatus service ended");
		
		return repo.findByapplicationStatus(status);
	}

	@Override
	public void deleteApplicationById(int applicationId) {
		
		logger.info("deleteApplicationById service started");
				
		repo.deleteById(applicationId);
		
		logger.info("deleteApplicationById service ended");
	}

	@Override
	public void deleteApplicationByEmailId(String emailId) {
		
		logger.info("deleteApplicationByEmailId service started");
		
		 repo.deleteApplicationByEmailId(emailId);
		 
		 logger.info("deleteApplicationByEmailId service ended");
	}

	@Override
	public Application getApplicationById(int applicationId) {
		
		logger.info("getApplicationById service started");
		logger.info("getApplicationById service ended");
		
		return repo.findById(applicationId).orElseThrow();
	}

	@Override
	public int updateApplicationStatus(Application app) {
		
		logger.info("updateApplicationStatus service started");
		logger.info("updateApplicationStatus service ended");
		return 0;
	}

	@Override
	public List<Application> viewAllApplicationDetails(String mail) 
	{
		logger.info("viewAllApplicationDetails service started");
		logger.info("viewAllApplicationDetails service ended");
		
		return repo.findByemailId(mail);
	}

	
	

}