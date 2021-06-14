package com.project.onlineAdminisionSystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int universityId;
	private String name;
	@OneToOne(cascade = {CascadeType.ALL})
	private Address address;
	
	
@OneToMany(cascade = {CascadeType.ALL})
@JoinColumn(name="universityId")
	private List<College> collegeList;


	
	public List<College> getCollegeList() {
	return collegeList;
}

public void setCollegeList(List<College> collegeList) {
	this.collegeList = collegeList;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	public University(String name, int universityId, Address address, ArrayList<College> collgeList) {
		super();
		this.name = name;
		this.universityId = universityId;
		this.address = address;
		
	}

	public University(String name) {
		super();
		this.name = name;

	}
	
	
	

	public University(int universityId, String name, Address address, List<College> collegeList) {
		super();
		this.universityId = universityId;
		this.name = name;
		this.address = address;
		this.collegeList = collegeList;
	}

	public University() {
		super();
	}

}
