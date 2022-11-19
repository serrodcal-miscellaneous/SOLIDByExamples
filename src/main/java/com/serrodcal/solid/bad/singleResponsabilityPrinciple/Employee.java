package com.serrodcal.solid.bad.singleResponsabilityPrinciple;

public class Employee {
    
    private String fullName;
    private String dateOfJoining;
    private String annualSalaryPackage;

    // standard getters and setters methods

    // business logic

    public long calculateEmployeeSalary(Employee emp) {
        return 0;
    }

    public long calculateEmployeeLeaves(Employee emp) {
        return 0;
    }

    public long calculateTaxOnSalary(Employee emp) {
        return 0;
    }

    // data persistence logic

    public Employee saveEmployee(Employee empl) {
        return new Employee();
    }

    public Employee updatEmployee(Employee emp) {
        return new Employee();
    }

}
