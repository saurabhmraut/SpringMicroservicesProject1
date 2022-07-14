package com.cg.EmpService.service;

import java.util.List; 
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cg.EmpService.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//fake employee database
	List<Employee> list = List.of(
			new Employee(101L, "Sainath",1001L),
			new Employee(102L, "Ravi",1001L),
			new Employee(103L, "Sham",1002L),
			new Employee(104L, "Ram" ,1003L),
			new Employee(105L, "Yuvi", 1003L)
			);
	
	@Override
	public Employee getEmployee(Long id) { 
		return  list.stream().filter(emp -> emp.getEmpId().equals(id)).findAny().orElse(null);
	}
	
	@Override
	public List<Employee> getEmpListByDeptId(Long id){
		
		return list.stream().filter(deptId -> deptId.getDeptId().equals(id)).collect(Collectors.toList());
	}

	@Override
	public List<Employee> getAllEmployee() { 
		return list.stream().collect(Collectors.toList());
	}
 
	
 

}
