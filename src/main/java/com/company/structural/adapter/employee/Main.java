package com.company.structural.adapter.employee;

import sun.util.resources.cldr.nus.CalendarData_nus_SD;

import java.net.CacheRequest;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		// Ida
		populateEmployeeData(classAdapter);
		// Vuelta
		BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
		String card = cardDesigner.designCard(classAdapter);
		System.out.println(card);
		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
		card = cardDesigner.designCard(employeeObjectAdapter);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
