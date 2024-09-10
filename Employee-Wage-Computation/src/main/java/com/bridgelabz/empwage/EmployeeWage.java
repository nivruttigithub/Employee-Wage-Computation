package com.bridgelabz.empwage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        int isPartTime=1;
        int isFullTime=2;
        int empRatePerHour = 20;
        int empHrs=0;
        int empWage=0;
        double empCheck = Math.floor(Math.random()*10)%2;
        if(empCheck==isFullTime)
        {
            System.out.println("Employee is Present Full Time..");
            empHrs=8;
        }
        else if(empCheck==isPartTime)
        {
            System.out.println("Employee is Present Part Time..");
            empHrs=4;
        }
        else {
            System.out.println("Employee is Abscent");
            empHrs=0;
        }
        empWage = empHrs*empRatePerHour;
        System.out.println("Employee wage: "+empWage);
    }
}
