package com.bridgelabz.empwage;

public class Main {
    public static void main(String[] args) {
        CalculateEmpWage companyA = new CalculateEmpWage("Accenture",30,3,10);
        companyA.computeEmpWage();
        CalculateEmpWage companyB = new CalculateEmpWage("QK",25,3,15);
        companyB.computeEmpWage();
    }
}
