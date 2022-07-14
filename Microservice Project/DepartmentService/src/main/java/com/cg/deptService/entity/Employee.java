package com.cg.deptService.entity;
  

public class Employee {
	
	private Long empId;
	private String name;
	private Department department;
	
	
	public Employee(Long empId, String name, Department department) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
	}
	public Employee(Long empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
