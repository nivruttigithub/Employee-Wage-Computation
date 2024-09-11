package com.bridgelabz.empwage;

import java.util.ArrayList;
import java.util.List;

public class CalculateEmpWage {
    private String compName;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHrsInMonth;
    private int totalEmpWage;  // total Wage for this Company

    public CalculateEmpWage(String compName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth) {
        this.compName = compName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
        this.totalEmpWage = 0; // Initialize total wage to 0
    }

    public void computeEmpWage() {
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

            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Company Name : " + compName + " | " + " Day: " + totalWorkingDays + " EmpHrs: " + empHrs);
        }

          totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for Company " + compName + " is " + totalEmpWage);
    }
        // Getter method to retrieve the total wage for the company
        public int getTotalEmpWage () {
            return totalEmpWage;
        }

    }
// Manager class to handle multiple companies
class EmpWageManager {
    // List to hold wage details of multiple companies
    private List<CalculateEmpWage> companyWageList;

    // Constructor to initialize the company list
    public EmpWageManager() {
        companyWageList = new ArrayList<>();
    }

    // Method to add a new company and compute its wage
    public void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth) {
        CalculateEmpWage company = new CalculateEmpWage(companyName, empRatePerHour, numOfWorkingDays, maxHrsInMonth);
        company.computeEmpWage();  // Compute the wage for this company
        companyWageList.add(company);  // Add the company to the list
    }
}

