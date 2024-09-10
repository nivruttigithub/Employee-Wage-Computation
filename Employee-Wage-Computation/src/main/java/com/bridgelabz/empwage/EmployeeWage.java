package com.bridgelabz.empwage;

public class EmployeeWage {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour =20;
    public static final int numOfWorkingDays = 2;
    public static final int maxHrsPerMonth = 10;
    public static void main(String[] args) {

        int empHrs=0;
        int totalEmpHrs = 0 ;
        int totalWorkingDays = 0 ;
        while(totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("days# : "+totalWorkingDays+" Emp Hours : "+empHrs);
        }
            int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total employee wage: " +totalEmpWage);
    }
}
