package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이재민");
	    System.out.println(studentLee.StudentName);
		//System.out.println(studentLee.getSerialNumber());
		System.out.println(Student1.getSerialNumber());
		
		Student1.serialNumber++;//10001
		
		System.out.println();
		
		Student1 studentKim=new Student1();
		studentLee.setStudentName("김장우");
		System.out.println(studentKim.StudentName);
		System.out.println(studentKim.getSerialNumber());
		Student1.serialNumber++;
		
		System.out.println();
		
		Student1 studentPark=new Student1();
		studentLee.setStudentName("박창훈");
		System.out.println(studentPark.StudentName);
		System.out.println(studentPark.getSerialNumber());
		Student1.serialNumber++;
		
		
	}

}
