package com.project.onlineAdminisionSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlineAdminisionSystem.entity.Admission;

public interface IAdmissionRepository extends JpaRepository<Admission , Integer>{

}
