package com.example.demo.controller;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<EmployeeEntity>> getallEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @PostMapping(value = "/save",produces = "application/json",consumes = "application/json")
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeEntity employee){
        LinkedHashMap<String,Object> response = new LinkedHashMap<>();
        long id = employeeService.saveEmployee(employee);
        response.put("status", 200);
        response.put("message" , "employee record is added for" + id );
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}",produces = "application/json")
    public ResponseEntity<?> getEmployeeById(@PathVariable(name = "id") long id){
        Optional<EmployeeEntity> employee = employeeService.getEmployeeById(id);
        if(employee.isPresent()){
            return new ResponseEntity<>(employee.get(),HttpStatus.FOUND);
        }
        return new ResponseEntity<>("user not found",HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/update", consumes = "application/json",produces = "application/json")
    public ResponseEntity<?> updateEmployee(@RequestBody EmployeeEntity employee){
        LinkedHashMap<String,Object> response = new LinkedHashMap<>();
        long id = employeeService.updateEmployee(employee);
        response.put("status", 200);
        response.put("message" , "employee record is update for " + id );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
