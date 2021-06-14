package com.project.onlineAdminisionSystem.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Branch;


@Repository
public interface IBranchRepository extends JpaRepository<Branch , Integer>
{

	
	/*public boolean addBranch( Branch branch);
	public ArrayList<Branch> viewAllBranchDetails();
	public int deleteBranchById(int branchId);
	public Branch getBranchById(int branchId);
	public int deleteBranchByName(String branchName);
	public int  updateBranch(Branch branch);*/

	void deleteBybranchName(String branchName);

	Branch findBybranchName(String branchName);
	

}
