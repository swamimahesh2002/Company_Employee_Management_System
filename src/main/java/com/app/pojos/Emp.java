package com.app.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="emp_tb")
public class Emp extends BaseEntity {
	
	

	private String name;
	
	private String email;
	
	private String graduation;
	
	@ManyToOne
    @JoinColumn(name = "dept_id")
    private Dept dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Emp(String name, String email, String graduation, Dept dept) {
		super();
		this.name = name;
		this.email = email;
		this.graduation = graduation;
		this.dept = dept;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", email=" + email + ", graduation=" + graduation + ", dept=" + dept + "]";
	}

	
	

}
