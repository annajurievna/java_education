package lesson2.task3;

public class Employee {
	private String name;
	private String surname;
	private double salaryHour;
	private double hoursPerMonth;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setSalaryHour(double salaryHour) {
		this.salaryHour = salaryHour;
	}
	public void setHoursPerMonth(double hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}
	
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	public double getSalaryHour() {
		return this.salaryHour;
	}
	public double getHoursPerMonth() {
		return this.hoursPerMonth;
	}
	
	public Employee(String name, String surname, double salaryHour, double hoursPerMonth) {
		this.name = name;
		this.surname = surname;
		this.salaryHour = salaryHour;
		this.hoursPerMonth = hoursPerMonth;
	}
}
