package it.betacom.model;

import java.time.LocalDate;

public class Employee {
	private String employeeId;
	private String fullName;
	private LocalDate dateOfBirth;
	
	public Employee(String fullName, LocalDate dateOfBirth) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
