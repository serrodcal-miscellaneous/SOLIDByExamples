package com.serrodcal.solid.bad.openClosePrinciple;

public class EmployeeSalary {
    
    private Long totalWorkingDay = 0L;
    private Long basicPay = 0L;

    public Long getCompanyBenefits() {
        return 0L;
    }

    public Long getBonus() {
        return 0L;
    }

    public Long calculateSalary(Employee emp) {
        Long salary = null;

        if (emp.getType().equals("PERMANENT")) {
            salary = (totalWorkingDay * basicPay) + getCompanyBenefits() + getBonus();
        } else if (emp.getType().equals("CONTRACT")) {
            salary = (totalWorkingDay * basicPay);
        }

        return salary;
    }
        
}
