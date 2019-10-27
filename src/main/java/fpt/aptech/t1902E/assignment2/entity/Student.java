package fpt.aptech.t1902E.assignment2.entity;


public class Student {
	private int id;
	private String name;
	private int yearOfBirth;
	private String address;
	private String phoneNumber;
	private int classId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public Student(int id, String name, int yearOfBirth, String address, String phoneNumber, int classId) {
		super();
		this.id=id;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.classId = classId;
	}
	public Student(String name, int yearOfBirth, String address, String phoneNumber, int classId) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.classId = classId;
	}
	@Override
	public String toString() {
		return "Student name=" + name + ", yearOfBirth=" + yearOfBirth + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", classId=" + classId + "]";
	}
	
	
	
}
