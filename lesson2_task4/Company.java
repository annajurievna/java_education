package lesson2.task3;

import java.util.List;

public class Company {
	private String name;
	private List<Department> departments;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmployees(List<Department> list) {
		this.departments.addAll(list);
	}
	
	public List<Department> getEmployees() {
		return this.departments;
	}
	
	public Company(String name, List<Department> list) {
		this.name = name;
		this.departments = list;
	}
	
	public String findEmployee(String name, String surname) {
		for (Department dep: this.departments) {
			String res = dep.getEmployeeInfo(name, surname);
			if (!res.equals("Not found")) {
				return res + " and works in the department of " + dep.getName();
			}
		}
		return "Not found";
	}
	
	public int countEmployees() {
		int count = 0;
		for (Department dep: this.departments) {
			count += dep.getCount();
		}
		return count;
	}
}
