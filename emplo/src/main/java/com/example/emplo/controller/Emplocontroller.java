package com.example.emplo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emplo.model.Emplomodel;
//import com.UST.EmployeeRegistration.model.Employee;
//import com.UST.EmployeeRegistration.service.EmployeeService;
import com.example.emplo.service.Emploservice;

@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class Emplocontroller {
	@Autowired
	private Emploservice employeeService;
	
	@PostMapping("/addemps")
	public Emplomodel addEmployee(@RequestBody Emplomodel employee) {
		return employeeService.createEmployee(employee);
	}
	@GetMapping("/Employees")
	public List<Emplomodel> getAllEmployee(){
		
		return employeeService.getEmployees();
	}
	
	@GetMapping("/Employees/{id}")
	public Emplomodel getEmployeeById(@PathVariable int id){
		return employeeService.getEmployeeById(id);
	}
	@PutMapping("/updateemployee/{id}")
	public Emplomodel updateEmployee(@RequestBody Emplomodel employee) {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}
	
	
	

}


