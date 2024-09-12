package com.bridgelabz.empwage;

public class Main {
    public static void main(String[] args) {
       EmpWageManager wageManager = new EmpWageManager();
        // Add companies and compute their wages
        wageManager.addCompany(" TCS ", 20, 2, 10);  // $20 per hour, 2 working days, max 10 hours
        System.out.println();
        wageManager.addCompany(" Wipro ", 25, 3, 15);  // $25 per hour, 3 working days, max 15 hours
        System.out.println();
        wageManager.computeEmpWage();

    }
}
