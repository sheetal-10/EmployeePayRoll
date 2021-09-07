package com.bridgelabzs;

/**
 * This is the main class that 
 * creates object of EmployeePayRollService and
 * calls read and write methods to the object and
 * prints employee data
 * @author sheetal 
 * @since 2021-09-05
 */
public class EmployeePayRollMain {
	public static void main(String[] args)
    {
       //Creating obj for EmployeePayRollService class
       EmployeePayRollService employeePayrollService = new EmployeePayRollService();
       System.out.println("Welcome to Employee Pay Roll");
       //calling readEmployeeDataFromConsole method
       employeePayrollService.readEmployeeDataFromConsole();
       //Calling writeEmployeeDataInConsole method
       employeePayrollService.writeEmployeeDataInConsole();
    }
}
