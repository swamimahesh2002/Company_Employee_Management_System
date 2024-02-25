package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Emp;
import com.app.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepo erepo;
	
	@Override
	public void addEmp(Emp emp) {
		erepo.save(emp);
	}

	@Override
	public List<Emp> getAll() {
		return erepo.findAll();
	}

}
