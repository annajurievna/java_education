package lesson2.task3;

import java.util.ArrayList;
import java.util.List;

import lesson2.task2.Author;

public class Main {
	
	public static void main(String[] args){
		Employee e1 = new Employee("Anna", "Banana", 12, 40);
		Employee e2 = new Employee("Ben", "Smith", 1, 40);
		Employee e3 = new Employee("Juily", "Gray", 22, 32);
		Employee e4 = new Employee("Peter", "Olif", 15, 48);
		Employee e5 = new Employee("Jack", "Jones", 7, 20);
		List<Employee> list1 = new ArrayList<Employee>();
		List<Employee> list2 = new ArrayList<Employee>();
		list1.add(e1);
		list1.add(e2);
		list2.add(e3);
		list2.add(e4);
		list2.add(e5);
		Department IT = new Department("IT", list1);
		Department Finance = new Department("Finance", list2);
		List<Department> allDepartments= new ArrayList<Department>();
		allDepartments.add(IT);
		allDepartments.add(Finance);
		Employee e6 = new Employee("Jill", "Black", 2, 48);
		Employee e7 = new Employee("Annalise", "Geller", 10, 40);
		Employee e8 = new Employee("Doyle", "Jones", 27, 20);
		IT.addEmployee(e6);
		Finance.addEmployee(e7);
		Finance.addEmployee(e8);
		IT.deleteEmployee("Anna", "Banana");
		Finance.deleteEmployee("Doyle", "Jonessss");
		Finance.deleteEmployee("Annalise", "Geller");
		
		Company Tinkoff = new Company("Tinkoff", allDepartments);
		System.out.println("Total amount of employees: " + Tinkoff.countEmployees());
		IT.infoDepartment();
		Finance.infoDepartment();
	}
}
