package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Dept extends BaseEntity {

    private String deptName;

    @OneToMany(mappedBy = "dept", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Emp> employees;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Emp> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Emp> employees) {
		this.employees = employees;
	}

	public Dept(String deptName, List<Emp> employees) {
		super();
		this.deptName = deptName;
		this.employees = employees;
	}

	public Dept() {
		super();
	}

	
    // Constructors, getters, setters

    
   }

