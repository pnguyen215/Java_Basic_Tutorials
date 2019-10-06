package com.phuocnguyen015.InterfaceExtend;

import java.util.Date;

public class EmployeeServiceImplement extends Person implements EmployeeService, PersonService {
	private static final long serialVersionUID = 1L;
	Person person = new Person(51503082, "Phuoc", "Huu", "Nguyen", "nguyenhuuphuocit97@gmail.com", "398 Le Van Luong",
			84981603797l, true, "CTO", "single");
	Date date = new Date();

	@Override
	public String getAddress() {
		return person.getAddress();
	}

	@Override
	public int getAge() {
		return person.getAge();
	}

	@Override
	public String getDetails() {
		return person.getGeneticInformation();
	}

	@Override
	public String getDetailsWorker() {
		return person.getOccupation();
	}

	public String getFullInformation() {
		return "EmployeeServiceImplement [person=" + person + ", date=" + date + "]";
	}

	@Override
	public String getName() {
		return person.getFullName();
	}

	@Override
	public Date joiningDate() {
		return date;
	}
	/*
	 * One class can extends more interface class
	 */
}
