package com.project.onlineAdminisionSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch 
{
	@Id
	private int branchId;
	private String branchName;
	private String branchDescription;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchDescription() {
		return branchDescription;
	}
	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}
	public Branch(int branchId, String branchName, String branchDescription) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchDescription = branchDescription;
	}
	
}
