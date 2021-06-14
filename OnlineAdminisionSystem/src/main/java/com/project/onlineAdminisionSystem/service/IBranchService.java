package com.project.onlineAdminisionSystem.service;

import com.project.onlineAdminisionSystem.entity.Branch;

import java.util.List;

public interface IBranchService {
	public Branch addBranch(Branch branch);
	public List<Branch> viewAllBranches();
	public Branch getBranchDetailsByName(String branchName);
	public void deleteBranchById(int branchId);
	public void deleteBranchByBranchName(String branchName);
	public Branch updateBranch(Branch branch);
	public Branch getBranchDetailsById(int id);

}
