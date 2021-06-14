package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;

import com.project.onlineAdminisionSystem.entity.Application;

public interface IApplicationService 
{
	public Application addApplication(Application application);
	public List<Application> viewAllApplicationDetails();
	public  ArrayList<Application> getApplicationDetailsByStatus(String status);
	public void deleteApplicationById(int applicationId);
	public Application getApplicationById(int applicationId);
	public int  updateApplicationStatus(Application app);
	//can add more funtion if require as per business logic
	ArrayList<Application> getApplicationDetailsByEmailId(String emailId);
	void deleteApplicationByEmailId(String emailId);
	public List<Application> viewAllApplicationDetails(String mail);
	
}