package com.project.onlineAdminisionSystem.entity;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import com.project.onlineAdminisionSystem.entity.ProgramScheduled;

@Entity
public class Application
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer applicationId;
	
	@NotNull(message = "Applicant Name cannot be null")
	@Size(min=3)
	private String applicantFullName;
	
	@NotNull(message = "DateofBirth cannot be null")
	private LocalDate dateOfBirth;
	
	@NotNull(message = "HighestQualification cannot be null")
	private String highestQualification;
	@NotNull(message = "Final percentage cannot be null")
	private double finalYearPercentage;
	private String goals;
	
	@NotNull(message = "Email Id cannot be null")
	private String emailId;
	//private ProgramScheduled schedule;
	private String applicationStatus;//Applied/ScheduleForInterview/InterViewCompleted/ApplicationAccepted/ApplicationRejected
	private LocalDate dateOfInterview;
	private String applicantInterviewFeedback;
	@OneToOne
	//private Payment payment;
	
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicantFullName() {
		return applicantFullName;
	}
	public void setApplicantFullName(String applicantFullName) {
		this.applicantFullName = applicantFullName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public double getFinalYearPercentage() {
		return finalYearPercentage;
	}
	public void setFinalYearPercentage(double finalYearPercentage) {
		this.finalYearPercentage = finalYearPercentage;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	//public ProgramScheduled getSchedule() {
		//return schedule;}
	//public void setSchedule(ProgramScheduled schedule) {
		//this.schedule = schedule;}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public LocalDate getDateOfInterview() {
		return dateOfInterview;
	}
	public void setDateOfInterview(LocalDate dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	public String getApplicantInterviewFeedback() {
		return applicantInterviewFeedback;
	}
	public void setApplicantInterviewFeedback(String applicantInterviewFeedback) {
		this.applicantInterviewFeedback = applicantInterviewFeedback;
	}
//   public Application(Integer applicationId, String applicantFullName, LocalDate dateOfBirth, String highestQualification, double finalYearPercentage, String goals, String emailId, ProgramScheduled schedule, String applicationStatus, LocalDate dateOfInterview, String applicantInterviewFeedback)
//	{
//		super();
//		this.applicationId = applicationId;
//		this.applicantFullName = applicantFullName;
//		this.dateOfBirth = dateOfBirth;
//		this.highestQualification = highestQualification;
//		this.finalYearPercentage = finalYearPercentage;
//		this.goals =goals;
//		this.emailId= emailId;
//		this.schedule= schedule;
//		this.applicationStatus= applicationStatus;
//		this.dateOfInterview= dateOfInterview;
//		this.applicantInterviewFeedback= applicantInterviewFeedback;
//	}
	
	
}
