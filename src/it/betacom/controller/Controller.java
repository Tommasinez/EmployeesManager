package it.betacom.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import it.betacom.model.Employee;

public class Controller {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();

		ArrayList<Employee> employees = new ArrayList<Employee>();

		Employee emp1 = new Employee("Mario Rossi", LocalDate.of(1993, 3, 12));
		Employee emp2 = new Employee("Luigi Verdi", LocalDate.of(1997, 4, 29));
		Employee emp3 = new Employee("Giovanni Bianchi", LocalDate.of(2000, 10, 16));

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		employees.forEach((emp) -> {
			Random random = new Random();
			emp.setEmployeeId(String.valueOf(random.nextInt(10000, 100000)));
		});

		Employee oldestEmp = Collections.max(employees, new Comparator<Employee>() {
			public int compare(Employee a, Employee b) {
				return Integer.compare(now.compareTo(a.getDateOfBirth()), now.compareTo(b.getDateOfBirth()));
			}
		});

		Integer oldestEmpAge = Period.between(oldestEmp.getDateOfBirth(), now).getYears();

		System.out.println(oldestEmp.getFullName() + ", the oldest employeee, is aged " + oldestEmpAge + ".");
	}
}
