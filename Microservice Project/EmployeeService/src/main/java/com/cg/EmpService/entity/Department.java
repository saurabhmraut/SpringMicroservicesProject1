package com.cg.EmpService.entity;



public class Department {
	private Long deptId;
	private String DeptName;
	private Long empId;
	
	
	
	public Department() { 
	}
	public Department(Long deptId, String deptName, Long empId) {
		super();
		this.deptId = deptId;
		DeptName = deptName;
		this.empId = empId;
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
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	
	

}
