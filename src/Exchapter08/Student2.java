package Exchapter08;

public class Student2 {

	
	public static int srialNumber=10000;
	int studentID;
	String StudentName;
	int grad;
	String address;
	public Student2() {
		srialNumber++;
		this.studentID = srialNumber;
	}
	
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public static int getSrialNumber() {
		return srialNumber;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
