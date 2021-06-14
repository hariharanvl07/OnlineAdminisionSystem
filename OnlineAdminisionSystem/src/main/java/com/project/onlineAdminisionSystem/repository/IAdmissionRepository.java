package com.project.onlineAdminisionSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Admission;
@Repository
public interface IAdmissionRepository extends JpaRepository<Admission , Integer>{

}
