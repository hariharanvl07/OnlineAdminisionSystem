package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;
import com.project.onlineAdminisionSystem.entity.Application;

public interface IApplicationRepository {
	public Application addApplication(Application application);
	public ArrayList<Application> viewAllApplicationDetails();
	public  ArrayList<Application> getApplicationDetailsByEmail(String email);
	public  ArrayList<Application> getApplicationDetailsByStatus(String status);
	public int deleteApplicationById(int applicationId);
	public int deleteApplicationByEmail(String email);
	public Application getApplicationById(int applicationId);
	public int  updateApplicationStatus(Application app);
	public ArrayList<Application> findByemailId(String email);

}
