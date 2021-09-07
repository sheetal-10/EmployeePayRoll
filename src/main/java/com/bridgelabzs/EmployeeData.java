package com.bridgelabzs;

/**
 * This class is for getters and setters of Employee Details
 * @author sheetal
 * @since 2021-09-05
 */
public class EmployeeData {
	// instance variables
	private int employeeId;
	private String employeeName;
	private int employeeSalary;

	// Creating Constructor
	public EmployeeData(int employeeId, String employeeName, int employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "EmployeeData{" + "employeeId=" + employeeId + ", employeeName='" + employeeName + '\''
				+ ", employeeSalary=" + employeeSalary + '}';
	}
}
