package com.mycompany.springboot.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.springboot.operation.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
