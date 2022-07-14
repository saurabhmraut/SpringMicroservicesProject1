package com.cg.deptService.entity;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private Long deptId;
	private String DeptName;  
	private List<Employee> empList = new ArrayList<>();
	 
	 
	
	public Department(Long deptId, String deptName) {
		super();
		this.deptId = deptId;
		DeptName = deptName;
	}
	public Department(Long deptId, String deptName, List<Employee> empList) {
	super();
	this.deptId = deptId;
	DeptName = deptName;
	this.empList = empList;
}
	
	public Department() { 
	}
	 
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
 
 
}

