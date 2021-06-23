package com.project.onlineAdminisionSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Admission
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int admissionId;
	private String emailId;
	
	private int applicationId;
	
	private String admissionStatus;//Confirm after payement done;
	
	private String college;

	private String program;

	private String course;

	private String branch;

	private String university;
	
	private String year;
	
	

	
	
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public int getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Admission(String emailId, String admissionStatus, String college, String program,
			String course, String branch, String university, String year,int applicationId) {
		super();
		this.emailId = emailId;
		this.applicationId = applicationId;
		this.admissionStatus = admissionStatus;
		this.college = college;
		this.program = program;
		this.course = course;
		this.branch = branch;
		this.university = university;
		this.year = year;
		this.applicationId=applicationId;
	}
	public Admission() {
		super();
	}
	

}
