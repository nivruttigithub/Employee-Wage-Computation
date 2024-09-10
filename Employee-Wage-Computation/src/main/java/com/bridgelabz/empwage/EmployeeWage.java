package com.bridgelabz.empwage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        int isFullTime=1;
        int empRatePerHour = 20;
        int empHrs=0;
        int empWage=0;
        double empCheck = Math.floor(Math.random()*10)%2;
        if(empCheck==isFullTime)
        {
            System.out.println("Employee is Present..");
            empHrs=8;
        }
        else {
            System.out.println("Employee is Abscent");
            empHrs=0;
        }
        empWage = empHrs*empRatePerHour;
        System.out.println("Employee wage: "+empWage);
    }
}
