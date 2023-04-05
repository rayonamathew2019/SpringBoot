package com.example.emplo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.UST.EmployeeRegistration.model.Employee;
//import com.UST.EmployeeRegistration.repository.EmployeeRepo;
import com.example.emplo.model.Emplomodel;
import com.example.emplo.repository.Emplorepo;

@Service

public class Emploservice {
	@Autowired
	private Emplorepo repo;
	public Emplomodel createEmployee(Emplomodel employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	public List<Emplomodel> getEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Emplomodel getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public Emplomodel updateEmployee(Emplomodel employee) {
		// TODO Auto-generated method stub
		Emplomodel oldemp=null;
		Optional<Emplomodel>optionalemployee=repo.findById(employee.getId());
		if(optionalemployee.isPresent()) {
			oldemp=optionalemployee.get();
			oldemp.setName(employee.getName());
			oldemp.setEmail(employee.getEmail());
			oldemp.setExperience(employee.getExperience());
			oldemp.setDeveloper(employee.getDeveloper());
			repo.save(oldemp);
			
		}else {
			return new Emplomodel();
		}
		return oldemp;
	}

	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "the employee is deleted";
	}

}
