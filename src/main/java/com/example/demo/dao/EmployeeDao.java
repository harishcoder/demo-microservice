package com.example.demo.dao;

import com.example.demo.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

     List<EmployeeEntity> getAllEmployee();
     long saveEmployee(EmployeeEntity employee);
     Optional<EmployeeEntity> getEmployee(long id);

     long updateEmployee(EmployeeEntity employee);

     void deleteEmployee(long id);

}
