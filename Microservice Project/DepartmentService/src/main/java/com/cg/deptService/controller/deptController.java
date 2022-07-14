package com.cg.deptService.controller;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.deptService.entity.Department; 
import com.cg.deptService.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class deptController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{deptId}")
	public Department getDepartment(@PathVariable("deptId") Long deptId) {
		
		Department dept = this.departmentService.getDepartment(deptId);
		
	    List  allEmp =  this.restTemplate.getForObject("http://localhost:9001/emp/deptId/"+dept.getDeptId(), List.class);
		dept.setEmpList( allEmp);

		return dept;
	}
	
	
}
