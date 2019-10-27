package fpt.aptech.t1902E.assignment2.entity;


public class Semester {
	private int id;
	private String name;
	private int year;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Semester(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	
}
