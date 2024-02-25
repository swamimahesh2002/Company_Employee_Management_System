package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Emp;


@Repository
public interface EmpRepo extends JpaRepository<Emp, Long> {
	
	}
