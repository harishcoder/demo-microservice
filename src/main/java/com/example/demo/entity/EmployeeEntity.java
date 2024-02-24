package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private long empId;
    private String designation;
    private String department;
    private long monthlySalary;
    private long yearlySalary;
    private long contactNo;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(long monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public long getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(long yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", monthlySalary=" + monthlySalary +
                ", yearlySalary=" + yearlySalary +
                ", contactNo=" + contactNo +
                ", address='" + address + '\'' +
                '}';
    }
}
