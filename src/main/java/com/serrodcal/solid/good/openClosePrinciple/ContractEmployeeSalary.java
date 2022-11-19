package com.serrodcal.solid.good.openClosePrinciple;

public class ContractEmployeeSalary implements EmployeeSalary {

    public Long getCompanyBenefits() {
        return 0L;
    }

    public Long getBonus() {
        return 0L;
    }

    @Override
    public Long calculateSalary() {
        Long totalWorkingDay = 0L;
        Long basicPay = 0L;

        return (totalWorkingDay * basicPay) + getCompanyBenefits() + getBonus();
    }
    
}
