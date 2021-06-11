package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.onlineAdminisionSystem.entity.Application;
import com.project.onlineAdminisionSystem.repository.IApplicationRepository;

public class ApplicationServiceImpl implements IApplicationService {
	
	@Autowired
	private IApplicationRepository repo;

	@Override
	public Application addApplication(Application application) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Application> viewAllApplicationDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Application> getApplicationDetailsByEmail(String email) {
		
		return repo.findByemailId(email);
	}

	@Override
	public ArrayList<Application> getApplicationDetailsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteApplicationById(int applicationId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteApplicationByEmail(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Application getApplicationById(int applicationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateApplicationStatus(Application app) {
		// TODO Auto-generated method stub
		return 0;
	}

}
