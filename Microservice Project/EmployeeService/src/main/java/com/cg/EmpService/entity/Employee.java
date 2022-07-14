package com.cg.EmpService.entity;
  

public class Employee {
	
	private Long empId;
	private String name;
	private String department;
	private Long deptId;
	private Location location;
	
	public Employee(Long empId, String name, Long deptId) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptId = deptId;
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


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	

}
