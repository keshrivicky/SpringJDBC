package com.database.SpringJDBC.SpringJDBC;

public class Student {
	
	private int studentId;
	private String studentName;
	private String Address;
	
	public Student(int studentId, String studentName, String address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		Address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Address=" + Address + "]";
	}
	
	

}
