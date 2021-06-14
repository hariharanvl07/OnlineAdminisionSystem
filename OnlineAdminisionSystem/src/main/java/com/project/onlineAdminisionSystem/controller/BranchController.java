package com.project.onlineAdminisionSystem.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.Branch;
import com.project.onlineAdminisionSystem.service.IBranchService;

@RestController
@RequestMapping("/branch")

public class BranchController {
	@Autowired
	private IBranchService service;
	Logger logger = LoggerFactory.getLogger(BranchController.class);
	
	@PostMapping("/addBranch")
	public Branch addBranch(@RequestBody Branch branch) {
		logger.info("addBranch Controller started");
		logger.info("addBranch Controller ended");
		return service.addBranch(branch);
		
		
	}
	
	@GetMapping("/getAllBranches")
	public List<Branch> viewAllBranches(){
		logger.info("getAllBranches Controller started");
		logger.info("getAllBranches Controller ended");
		return service.viewAllBranches();
		
	}
	
	@GetMapping("/getBranchByName/{name}")
	public Branch getBranchDetailsByName(@PathVariable("name") String branchName){
		logger.info("getBranchByName Controller started");
		logger.info("getBranchByName Controller ended");
		return service.getBranchDetailsByName(branchName);
		
	}
	
	@DeleteMapping("/deleteBranchById/{Id}")
	public void deleteBranchById(@PathVariable("Id") int branchId) {
		logger.info("deleteBranchById Controller started");
		service.deleteBranchById(branchId);
		logger.info("deleteBranchById Controller ended");
	}
	
	@DeleteMapping("/deleteBranchByBranchName/{name}")
	public void deleteBranchByBranchName(@PathVariable("name") String branchName) {
		logger.info("deleteBranchByBranchName Controller started");
		service.deleteBranchByBranchName(branchName);
		logger.info("deleteBranchByBranchName Controller ended");
	}
	
	@PutMapping("/updateBranch")
	public Branch updateBranch(@RequestBody Branch branch) {
		logger.info("updateBranch Controller started");
		logger.info("updateBranch Controller ended");
		return service.updateBranch(branch);
		
	}
}

