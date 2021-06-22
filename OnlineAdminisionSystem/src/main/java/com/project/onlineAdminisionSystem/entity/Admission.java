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
	@OneToOne
	private Application applicationId;
	
	private String admissionStatus;//Confirm after payement done;
	@OneToOne
	private College college;
	@OneToOne
	private Program program;
	@OneToOne
	private Course course;
	@OneToOne
	private Branch branch;
	@OneToOne
	private University university;
	
	private String year;
	
	

	
	
	public Application getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Application applicationId) {
		this.applicationId = applicationId;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
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
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Admission(String emailId, String admissionStatus, College college, Program program,
			Course course, Branch branch, University university, String year,Application applicationId) {
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
