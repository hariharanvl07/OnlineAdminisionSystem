package com.project.onlineAdminisionSystem.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Course 
{
	@Id
	private int courseId;
	private String courseName;
	private String description;
	private String eligibility;
	//private College college;
	private ArrayList<Branch> branches;
	
	
	public Course() {
		super();
	}
	@ManyToOne
	private College college;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public ArrayList<Branch> getBranches() {
		return branches;
	}
	public void setBranches(ArrayList<Branch> branches) {
		this.branches = branches;
	}
	public Course(int courseId, String courseName, String description, String eligibility, College college,
			ArrayList<Branch> branches) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.eligibility = eligibility;
		this.college = college;
		this.branches = branches;
	}
	
}
