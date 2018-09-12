package com.capgemini.employeeapp.model;

import java.util.List;



public interface EmployeeDao {
	public List<Employee>findAllEmployees();
	public Employee findEmployeeById(int employeeId);
	public boolean deleteEmployee(int employeeId);
	public boolean addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);

	

}
