package com.example.demo.service;

import com.example.demo.dao.EmployeeDaoImpl;
import com.example.demo.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;
    public List<EmployeeEntity> getAllEmployee(){
        return employeeDaoImpl.getAllEmployee();
    }

    public long saveEmployee(EmployeeEntity employee){
        return employeeDaoImpl.saveEmployee(employee);
    }

    public Optional<EmployeeEntity> getEmployeeById(long id){
        return employeeDaoImpl.getEmployee(id);
    }

    public long updateEmployee(EmployeeEntity emp){
        Optional<EmployeeEntity> existingEmployee = getEmployeeById(emp.getEmpId());
        if(existingEmployee.isPresent()){
            employeeDaoImpl.deleteEmployee(existingEmployee.get().getId());
        }
        return employeeDaoImpl.saveEmployee(emp);
    }

    public void deleteEmployee(long id){
        employeeDaoImpl.deleteEmployee(id);
    }
}
