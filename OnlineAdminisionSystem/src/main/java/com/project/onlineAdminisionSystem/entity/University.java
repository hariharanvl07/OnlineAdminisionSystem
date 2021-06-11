package com.project.onlineAdminisionSystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class University {
	@Id
	private int universityId;
	private String name;
	@OneToOne
	private Address address;
	@OneToMany
	private List<College> collgeList;

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

	public List<College> getCollgeList() {
		return collgeList;
	}

	public void setCollgeList(List<College> collgeList) {
		this.collgeList = collgeList;
	}

	public University(String name, int universityId, Address address, ArrayList<College> collgeList) {
		super();
		this.name = name;
		this.universityId = universityId;
		this.address = address;
		this.collgeList = collgeList;
	}

	public University(String name) {
		super();
		this.name = name;

	}

	public University() {
		super();
	}

}
