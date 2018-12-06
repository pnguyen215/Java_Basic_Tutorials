package com.phuocnguyen015.InterfaceExtend;

public class Main {

	public static void main(String[] args) {

		EmployeeServiceImplement employeeServiceImplement = new EmployeeServiceImplement();
		System.out.println(employeeServiceImplement.joiningDate());
		employeeServiceImplement.setFullName("PhuocNguyenHuu");
		employeeServiceImplement.setAge(21);
		employeeServiceImplement.setAddress("398 Le Van Luong");
		employeeServiceImplement.setEmail("nguyenhuuphuocit97@gmail.com");
		employeeServiceImplement.setGender(true);
		employeeServiceImplement.setGeneticInformation("OA");
		employeeServiceImplement.setId(51503082);
		employeeServiceImplement.setLocation("Long An");
		employeeServiceImplement.setDriverLicense(316L);
		employeeServiceImplement.setNationalIdentificationNumber(301605834);
		employeeServiceImplement.setOccupation("IT");
		employeeServiceImplement.setStatus("Single");
		System.out.println(employeeServiceImplement.getFullInformation());
		System.out.println(employeeServiceImplement.getOccupation());
		System.out.println(employeeServiceImplement.toString());
	}

}
