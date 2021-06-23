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
	public void deleteApplicationByEmailId(String emailId);
	
	public Application getApplicationById(int applicationId);
	
	public Application  updateApplicationStatus(Application app);
	
	Application getApplicationDetailsByEmailId(String emailId);
	public Application viewAllApplicationDetailsByMail(String mail);
	List<Application> viewAllApplicationDetails(String status);
	public List<Application> getAllApplicationByStudentId(int id);
	
}