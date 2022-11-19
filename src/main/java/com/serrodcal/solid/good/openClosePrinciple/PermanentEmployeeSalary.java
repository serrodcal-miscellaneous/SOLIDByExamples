package com.serrodcal.solid.good.openClosePrinciple;

public class PermanentEmployeeSalary implements EmployeeSalary {

    @Override
    public Long calculateSalary() {
        Long totalWorkingDay = 0L;
        Long basicPay = 0L;
        
        return (totalWorkingDay * basicPay);
    }
    
}
