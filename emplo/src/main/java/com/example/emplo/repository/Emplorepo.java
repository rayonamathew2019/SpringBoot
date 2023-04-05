package com.example.emplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emplo.model.Emplomodel;

//import com.UST.EmployeeRegistration.model.Employee;
@Repository
public interface Emplorepo extends JpaRepository<Emplomodel,Integer> {

}


