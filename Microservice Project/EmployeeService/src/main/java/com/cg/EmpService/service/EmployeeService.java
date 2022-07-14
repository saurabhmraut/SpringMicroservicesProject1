package com.cg.EmpService.service;
 

import java.util.List;

import com.cg.EmpService.entity.Employee;

public interface EmployeeService {
	
	public Employee getEmployee(Long id);
	public List<Employee> getEmpListByDeptId(Long id);
	public List<Employee> getAllEmployee();

}
