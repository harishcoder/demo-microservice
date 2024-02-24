package com.example.demo.dao;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> getEmployee(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public long updateEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee).getEmpId();
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public long saveEmployee(EmployeeEntity employee){
        return employeeRepository.save(employee).getEmpId();
    }
}
