package com.project.onlineAdminisionSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Admission;
@Repository
public interface IAdmissionRepository extends JpaRepository<Admission , Integer>{
	@Query(value="select * from admissions where application_id_application_id= :id ;",nativeQuery=true)
	Optional<Admission> getAdmissionByApplicationId(@Param("id")int applicationId);

}
