package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;

import com.project.onlineAdminisionSystem.entity.Branch;



public interface IBranchRepository
{
	public boolean addBranch( Branch branch);
	public ArrayList<Branch> viewAllBranchDetails();
	public  ArrayList<Branch> getBranchDetailsByName(String branchName);
	public int deleteBranchById(int branchId);
	public Branch getBranchById(int branchId);
	public int deleteBranchByName(String branchName);
	public int  updateBranch(Branch branch);

}
