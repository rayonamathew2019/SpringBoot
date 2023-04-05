package com.UST.EmployeeRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UST.EmployeeRegistration.model.Employee;

@Repository
//Integer is used here because primary key is of the type integer
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
