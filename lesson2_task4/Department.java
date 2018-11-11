package lesson2.task3;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private List<Employee> employees;
	private int count;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setEmployees(List<Employee> list) {
		this.employees.addAll(list);
		this.count += list.size();
	}
	
	public List<Employee> getEmployees() {
		return this.employees;
	}
	
	public void addEmployee(Employee emp) {
		this.employees.add(emp);
		count++;
	}
	
	public Department(String name, List<Employee> list) {
		this.name = name;
		this.employees = list;
		this.count = list.size();
	}
	
	public void deleteEmployee(String name, String surname) {
		Boolean found = false;
		List<Employee> listNew = new ArrayList<Employee>();
		for (Employee e: employees) {
			if (e.getName().equals(name) && e.getSurname().equals(surname)) {
				found = true;
			}
			else {
				listNew.add(e);
			}
		}
		this.employees = listNew;
		if (found) {
			this.count--;
		}
		
	}
	
	public String getEmployeeInfo(String name, String surname) {
		for (Employee e: employees) {
			if (e.getName().equals(name) && e.getSurname().equals(surname)) {
				return e.getName() + " " + e.getSurname() + " gets " + e.getSalaryHour() + " for an hour and works " + e.getHoursPerMonth() + " hours in a month";
			}
		}
		return "Not found";
	}
	
	public void infoDepartment() {
		System.out.println("Department of " + this.name + " includes " + this.count + " people: ");
		for (Employee e: employees) {
			System.out.println(e.getName() + " " + e.getSurname() + " gets " + e.getSalaryHour() + " for an hour and works " + e.getHoursPerMonth() + " hours in a month");
		}
	}
}
