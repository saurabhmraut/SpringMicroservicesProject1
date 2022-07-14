package com.cg.deptService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.deptService.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private List<Department> list = List.of(
			new Department(1001L,"Math"),
			new Department(1002L, "Science"),
			new Department(1003L, "Stats")
			);
	
	@Override
	public Department getDepartment(Long id) {
		
		return this.list.stream().filter(dept -> dept.getDeptId().equals(id)).findAny().orElse(null);
	}

}
