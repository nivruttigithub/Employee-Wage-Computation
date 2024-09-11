package com.bridgelabz.empwage;

public class CalculateEmpWage {
    private String compName;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHrsInMonth;
    public CalculateEmpWage(String compName,int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth) {
        this.compName = compName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
    }
    public int computeEmpWage() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case 1: // Part-time
                    empHrs = 4;
                    break;

                case 2: // Full-time
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHrs =totalEmpHrs + empHrs;
            System.out.println("Company Name : "+compName+" | "+" Day: " + totalWorkingDays + " EmpHrs: " + empHrs);
        }

        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for Company "+compName+" is " + totalEmpWage);
        return totalEmpWage;
    }

}
