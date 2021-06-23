
package com.project.onlineAdminisionSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collegeRegId;

	@NotNull(message = "College Name cannot be null")
	@Size(min = 3, max = 12)
	private String collegeName;
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = " adddressId")
	private Address collegeAddress;

	

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "collegeId")
	private List< Program> programList;

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

	public List<Program> getProgramList() {
		return programList;
	}

	public void setProgramList(List<Program> programList) {
		this.programList = programList;
	}

	public College(int collegeRegId, String collegeName, Address collegeAddress, List<Program> programList) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.programList = programList;

	}

	public College(String collegeName, Address collegeAddress, String universityName, List<Program> programList) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;


		this.programList = programList;

	}

	public College() {
		super();
	}

	@Override
	public String toString() {
		return "College [collegeRegId=" + collegeRegId + ", collegeName=" + collegeName + ", collegeAddress="
				+ collegeAddress + ", programList=" + programList + "]";
	}

}