package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;

import com.project.onlineAdminisionSystem.entity.Application;

public interface IApplicationService 
{
	public Application addApplication(Application application);
	public ArrayList<Application> viewAllApplicationDetails();
	public  ArrayList<Application> getApplicationDetailsByEmail(String email);
	public  ArrayList<Application> getApplicationDetailsByStatus(String status);
	public int deleteApplicationById(int applicationId);
	public int deleteApplicationByEmail(String email);
	public Application getApplicationById(int applicationId);
	public int  updateApplicationStatus(Application app);
	//can add more funtion if require as per business logic
	
}