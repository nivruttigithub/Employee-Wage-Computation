package com.bridgelabz.empwage;

public interface EmpWageBuilder {
    void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth);
    void computeEmpWage();
    int getTotalWage(String companyName);

}
