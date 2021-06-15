package com.project.onlineAdminisionSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
@Entity
public class Course 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseId;
	private String courseName;
	private String description;
	private String eligibility;
	//private College college;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name="courseId")
	private List<Branch> branches;
	
	@ManyToOne(cascade = {CascadeType.ALL})
@JoinColumn(name=" collegeId")
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
	
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public Course(int courseId, String courseName, String description, String eligibility,
			List<Branch> branches) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.eligibility = eligibility;
		
		this.branches = branches;
	}
	public Course() {
		super();
	}
	
}
