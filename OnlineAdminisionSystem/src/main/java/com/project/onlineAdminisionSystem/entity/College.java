
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
import javax.persistence.OneToOne;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int collegeRegId;
	private String collegeName;
	@OneToOne(cascade = {CascadeType.ALL})
	private Address collegeAddress;
	
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Course> courseList;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Branch> branchList;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name=" university_university_id")
	private University university;
	
	private String universityName;
	
@OneToMany(cascade = {CascadeType.ALL})
@JoinColumn(name="collegeId")
	private List<Program> programList;
	
	


	public String getUniversityName() {
	return universityName;
}
public void setUniversityName(String universityName) {
	this.universityName = universityName;
}
	public int getCollegeRegId() {
		return collegeRegId;
	}
	public void setCollegeRegId(int collegeRegId) {
		this.collegeRegId = collegeRegId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Address getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(Address collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public List<Branch> getBranchList() {
		return branchList;
	}
	public void setBranchList(List<Branch> branchList) {
		this.branchList = branchList;
	}

	
	
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public List<Program> getProgramList() {
		return programList;
	}
	public void setProgramList(List<Program> programList) {
		this.programList = programList;
	}

	
	
	public College(int collegeRegId, String collegeName, Address collegeAddress, List<Program> programList,
			List<Course> courseList, List<Branch> branchList,String universityName) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.programList = programList;
		this.courseList = courseList;
		this.branchList = branchList;
		this.universityName=universityName;
	
	
	}
	public College(String collegeName, Address collegeAddress, List<Course> courseList, University university) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.courseList = courseList;
		
	}
	public College(String collegeName, Address collegeAddress, University university) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	;
	}
	public College(int collegeRegId, String collegeName) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
	}
	
	public College() {
		super();
	}




}