package com.project.onlineAdminisionSystem.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Branch;
import com.project.onlineAdminisionSystem.repository.IBranchRepository;
@Service
public class BranchServiceImpl implements IBranchService {

@Autowired
private IBranchRepository repo;
Logger logger = LoggerFactory.getLogger(BranchServiceImpl.class);
	@Override
	public Branch addBranch(Branch branch) {
		// TODO Auto-generated method stub
		logger.info("addBranch Service started");
		logger.info("addBranch Service ended");
		return repo.save(branch);
	}

	@Override
	public List<Branch> viewAllBranches() {
		// TODO Auto-generated method stub
		logger.info("viewAllBranches Service started");
		logger.info("viewAllBranches Service ended");
		return repo.findAll();
	}

	@Override
	public Branch getBranchDetailsByName(String branchName) {
		// TODO Auto-generated method stub
		logger.info("getBranchDetailsByName Service started");
		logger.info("getBranchDetailsByName Service ended");
		return repo.findBybranchName(branchName);
	}

	@Override
	public void deleteBranchById(int branchId) {
		// TODO Auto-generated method stub
		logger.info("deleteBranchById Service started");
		repo.deleteById(branchId);
		logger.info("deleteBranchById Service ended");
		
	}

	@Override
	public void deleteBranchByBranchName(String branchName) {
		// TODO Auto-generated method stub
		Branch branch = repo.findBybranchName(branchName);
		logger.info("deleteBranchByBranchName Service started");
		repo.deleteById(branch.getBranchId());
		logger.info("deleteBranchByBranchName Service ended");
	}

	@Override
	public Branch updateBranch(Branch branch) {
		Branch branch1 = repo.findById(branch.getBranchId()).orElseThrow();
		branch1.setBranchName(branch.getBranchName());
		branch1.setBranchDescription(branch.getBranchDescription());
		logger.info("updateBranch Service started");
		logger.info("updateBranch Service ended");
		return repo.save(branch);
	}

	@Override
	public Branch getBranchDetailsById(int id) {
		// TODO Auto-generated method stub
		logger.info("getBranchDetailsById Service started");
		logger.info("getBranchDetailsById Service ended");
		return repo.findById(id).orElseThrow();
	}

}
