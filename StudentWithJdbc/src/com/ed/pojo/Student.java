package com.ed.pojo;

public class Student 
{
	private int studentId;
    private String studentName;
    private String studentContact;
    private String studentCity;
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
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String studentContact, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentContact = studentContact;
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentContact=" + studentContact
				+ ", studentCity=" + studentCity + "]";
	}
    
    
}
