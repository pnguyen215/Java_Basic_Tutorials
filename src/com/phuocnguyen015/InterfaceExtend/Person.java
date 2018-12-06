package com.phuocnguyen015.InterfaceExtend;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String firstName;
	private String lastName;
	private String midName;
	private String fullName;
	private long nationalIdentificationNumber;
	private int age;
	private String email;
	private String address;
	private int passportNumber;
	private long driverLicense;
	private String location;
	private long telephoneNumber;
	private boolean isGender;
	private String occupation; // major at present
	private String status; // single or relationship or married
	private int paymentCardNumber; // PAN
	private String geneticInformation; // Genes of human: A, B, O, AB

	public Person() {
		super();
	}

	public Person(int id, String firstName, String lastName, String midName, String fullName,
			long nationalIdentificationNumber, String email, String address, int passportNumber, long driverLicense,
			String location, int telephoneNumber, boolean isGender, String occupation, String status,
			int paymentCardNumber, String geneticInformation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.fullName = fullName;
		this.nationalIdentificationNumber = nationalIdentificationNumber;
		this.email = email;
		this.address = address;
		this.passportNumber = passportNumber;
		this.driverLicense = driverLicense;
		this.location = location;
		this.telephoneNumber = telephoneNumber;
		this.isGender = isGender;
		this.occupation = occupation;
		this.status = status;
		this.paymentCardNumber = paymentCardNumber;
		this.geneticInformation = geneticInformation;
	}

	public Person(int id, String firstName, String lastName, String midName, String email, String address,
			long telephoneNumber, boolean isGender, String occupation, String status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.email = email;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.isGender = isGender;
		this.occupation = occupation;
		this.status = status;
	}

	public Person(int id, String fullName, long nationalIdentificationNumber, String email, String address,
			int passportNumber, long driverLicense) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.nationalIdentificationNumber = nationalIdentificationNumber;
		this.email = email;
		this.address = address;
		this.passportNumber = passportNumber;
		this.driverLicense = driverLicense;
	}

	public Person(int id, String fullName, long nationalIdentificationNumber, String email, String address,
			String location, long telephoneNumber, boolean isGender, String occupation) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.nationalIdentificationNumber = nationalIdentificationNumber;
		this.email = email;
		this.address = address;
		this.location = location;
		this.telephoneNumber = telephoneNumber;
		this.isGender = isGender;
		this.occupation = occupation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getNationalIdentificationNumber() {
		return nationalIdentificationNumber;
	}

	public void setNationalIdentificationNumber(long nationalIdentificationNumber) {
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public long getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(long driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public boolean isGender() {
		return isGender;
	}

	public void setGender(boolean isGender) {
		this.isGender = isGender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPaymentCardNumber() {
		return paymentCardNumber;
	}

	public void setPaymentCardNumber(int paymentCardNumber) {
		this.paymentCardNumber = paymentCardNumber;
	}

	public String getGeneticInformation() {
		return geneticInformation;
	}

	public void setGeneticInformation(String geneticInformation) {
		this.geneticInformation = geneticInformation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", midName=" + midName
				+ ", fullName=" + fullName + ", nationalIdentificationNumber=" + nationalIdentificationNumber + ", age="
				+ age + ", email=" + email + ", address=" + address + ", passportNumber=" + passportNumber
				+ ", driverLicense=" + driverLicense + ", location=" + location + ", telephoneNumber=" + telephoneNumber
				+ ", isGender=" + isGender + ", occupation=" + occupation + ", status=" + status
				+ ", paymentCardNumber=" + paymentCardNumber + ", geneticInformation=" + geneticInformation + "]";
	}



}
