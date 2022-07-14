package com.cg.EmpService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.EmpService.entity.Employee;
import com.cg.EmpService.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping("/")
	public List<Employee> getAllEmps() {
		
		
		return this.employeeService.getAllEmployee();
	}
	
	@RequestMapping("/empId/{empId}")
	public Employee getEmp(@PathVariable("empId") Long empId) {
		
//		Employee emp =  this.employeeService.getEmployee(empId); 
//		String dept = this.restTemplate.getForObject("http://localhost:9001/dept/empId/"+emp.getEmpId(), String.class);
//		System.out.println(dept);
//		emp.setDepartment(dept);
//		return emp;
		
		return this.employeeService.getEmployee(empId); 
	}
	
	///location-service
	
	@RequestMapping("/deptId/{deptId}")
	public List<Employee> getEmpUsingDeptId(@PathVariable("deptId") Long deptId) {
		return this.employeeService.getEmpListByDeptId(deptId);
	}

}
