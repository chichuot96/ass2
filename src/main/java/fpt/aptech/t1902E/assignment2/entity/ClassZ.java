package fpt.aptech.t1902E.assignment2.entity;

public class ClassZ {
	private int id;
	private String name;
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
	public ClassZ(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public ClassZ(String name) {
		super();
		this.name = name;
	}
	
}
