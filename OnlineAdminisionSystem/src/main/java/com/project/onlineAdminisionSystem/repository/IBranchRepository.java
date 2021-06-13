package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Branch;


@Repository
public interface IBranchRepository extends JpaRepository<Branch, Integer>
{
	

}
