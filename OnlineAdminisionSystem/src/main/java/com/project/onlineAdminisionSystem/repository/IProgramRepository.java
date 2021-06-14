package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;

import com.project.onlineAdminisionSystem.entity.Program;


public interface IProgramRepository {
	public Program addProgram(Program program);
	public ArrayList<Program> viewAllProgramDetails();
	public  ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName);
	public  ArrayList<Program> getProgramDetailsByName(String programName);
	public  ArrayList<Program> getProgramDetailsByEligibility(String eligibility);
	public int deleteProgramById(int programId);
	public int deleteProgramByName(String programName);
	public Program getProgramById(int programId);
	public int  updateProgramStatus(Program program);
}
