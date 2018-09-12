package com.capgemini.employeeapp.model;

public class Employee {
	private int employeeId;
	private String employeename;
	private double employeeSalary;
	private String employeeDepartment;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeename, double employeeSalary, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	

}
