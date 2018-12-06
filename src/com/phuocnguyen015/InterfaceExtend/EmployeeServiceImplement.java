package com.phuocnguyen015.InterfaceExtend;

import java.util.Date;

public class EmployeeServiceImplement extends Person implements EmployeeService {
	private static final long serialVersionUID = 1L;
	Person person = new Person(51503082, "Phuoc", "Huu", "Nguyen", "nguyenhuuphuocit97@gmail.com", "398 Le Van Luong",
			84981603797l, true, "CTO", "single");
	Date date = new Date();

	@Override
	public String getName() {
		return person.getFullName();
	}

	@Override
	public int getAge() {
		return person.getAge();
	}

	@Override
	public String getAddress() {
		return person.getAddress();
	}

	@Override
	public String getDetails() {
		return person.getGeneticInformation();
	}

	@Override
	public String getDetailsWorker() {
		return person.getOccupation();
	}

	@Override
	public Date joiningDate() {
		return date;
	}

	public String getFullInformation() {
		return "EmployeeServiceImplement [person=" + person + ", date=" + date + "]";
	}

}
