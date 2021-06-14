package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Admission;
import com.project.onlineAdminisionSystem.repository.IAdmissionRepository;

@Service
class AdmissionServiceImpl implements IAdmissionService{

@Autowired
private IAdmissionRepository repo;


	@Override
	public Admission addAdmission(Admission admission) {
		// TODO Auto-generated method stub
		return repo.save(admission);
	}

	@Override
	public void deleteAdmissionById(int admissionId) {
		// TODO Auto-generated method stub
		repo.deleteById(admissionId);
		
	}

	@Override
	public Admission updateAdmission(Admission admission) {
		// TODO Auto-generated method stub
		return repo.save(admission);
	}

	@Override
	public Optional<Admission> getAdmissionbyId(int admissionId) {
		// TODO Auto-generated method stub
		return repo.findById(admissionId);
	}

	@Override
	public List<Admission> viewAllAdmissions() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
