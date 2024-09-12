package com.bridgelabz.empwage;

import java.util.ArrayList;
import java.util.List;

public class CalculateEmpWage{
    private String compName;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHrsInMonth;
    private int totalEmpWage;  // total Wage for this Company
    private List<Integer> dailyWages; // To store daily wages

    public CalculateEmpWage(String compName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth) {
        this.compName = compName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
        this.totalEmpWage = 0; // Initialize total wage to 0
        this.dailyWages = new ArrayList<>(); // Initialize daily wages list
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
            int dailyWage = empHrs * empRatePerHour;
            dailyWages.add(dailyWage);   // Add daily Wage to the list
            System.out.println("Company Name : " + compName + " | " + " Day: " + totalWorkingDays + " EmpHrs: " + empHrs+ " Daily Wage: " + dailyWage);
        }

          totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for Company " + compName + " is " + totalEmpWage);
    }
        // Getter method to retrieve the total wage for the company
        public int getTotalEmpWage () {
            return totalEmpWage;
        }

    public String getCompName() {
        return compName;
    }
    public List<Integer> getDailyWages() {
        return dailyWages;
    }
    }
// Manager class to handle multiple companies
class EmpWageManager implements EmpWageBuilder {
    // List to hold wage details of multiple companies
    private List<CalculateEmpWage> companyWageList;

    // Constructor to initialize the company list
    public EmpWageManager() {

        companyWageList = new ArrayList<>();
    }

    // Method to add a new company and compute its wage
    @Override
    public void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth) {
        CalculateEmpWage comp = new CalculateEmpWage(companyName, empRatePerHour, numOfWorkingDays, maxHrsInMonth);
        comp.computeEmpWage();  // Compute the wage for this company
        companyWageList.add(comp);  // Add the company to the list
    }
    @Override
    public void computeEmpWage() {
        for (CalculateEmpWage company : companyWageList) {
            company.computeEmpWage(); // Compute wages for each company
        }
    }

    @Override
    public int getTotalWage(String companyName) {
        for (CalculateEmpWage company : companyWageList) {
            if (company.getCompName().equals(companyName)) {
                return company.getTotalEmpWage();
            }
        }
        return 0;
    }
    public List<Integer> getDailyWages(String companyName) {
        for (CalculateEmpWage company : companyWageList) {
            if (company.getCompName().equals(companyName)) {
                return company.getDailyWages();
            }
        }
        return new ArrayList<>(); // Return  empty list if company not found
    }
}

