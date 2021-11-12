package com.epam.brest.model;

public class Employee {
    private Integer employeeId;
    private String firtName;
    private String lastName;
    private String email;
    private Double salary;
    private Integer departmentId;


    public Employee(Integer employeeId, String firtName, String lastName, String email, Double salary, Integer departmentId) {
        this.employeeId = employeeId;
        this.firtName = firtName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.departmentId = departmentId;

    }
}
