package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Application;
import com.project.onlineAdminisionSystem.repository.IApplicationRepository;

@Service
public class ApplicationServiceImpl implements IApplicationService {
	
	@Autowired
	private IApplicationRepository repo;

	@Override
	public Application addApplication(Application application) {
		return repo.save(application);
	}

	@Override
	public List<Application> viewAllApplicationDetails() {
		return repo.findAll();
	}

	@Override
	public ArrayList<Application> getApplicationDetailsByEmailId(String emailId) {
		
		return repo.findByemailId(emailId);
	}

	@Override
	public ArrayList<Application> getApplicationDetailsByStatus(String status) {
		return repo.findByapplicationStatus(status);
	}

	@Override
	public void deleteApplicationById(int applicationId) {
		repo.deleteById(applicationId);
	}

	@Override
	public void deleteApplicationByEmailId(String emailId) {
		 repo.deleteApplicationByEmailId(emailId);
	}

	@Override
	public Application getApplicationById(int applicationId) {
		return repo.findById(applicationId).orElseThrow();
	}

	@Override
	public int updateApplicationStatus(Application app) {
		return 0;
	}

	@Override
	public List<Application> viewAllApplicationDetails(String mail) 
	{
		return repo.findByemailId(mail);
	}

	
	

}