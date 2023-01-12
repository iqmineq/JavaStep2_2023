package chapter08;

public class Student1 {
	public static int serialNumber = 10000;
	int studentID;
	String StudentName;
	int grade;
	String address;

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public static int getSerialNumber() {
		return serialNumber;
	}
  
}
