package fpt.aptech.t1902E.assignment2.entity;

public class StudentMark {
	private int studentId;
	private int subjectId;
	private int semesterId;
	private int mark;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public int getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(int semesterId) {
		this.semesterId = semesterId;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public StudentMark(int studentId, int subjectId, int semesterId, int mark) {
		super();
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.semesterId = semesterId;
		this.mark = mark;
	}
	
}
