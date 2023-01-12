package chapter08;

public class StudentMain2 {

	public static void main(String[] args) {
		
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이재민");
	    studentLee.studentID=studentLee.serialNumber;
		System.out.println("이름 : "+studentLee.StudentName+"|아이디 : "+studentLee.serialNumber);
		Student1.serialNumber++;//10001
		
		System.out.println();
		
		Student1 studentKim=new Student1();
		studentKim.setStudentName("김장우");
		System.out.println("이름 : "+studentKim.StudentName+"|아이디 : "+studentKim.serialNumber);
		Student1.serialNumber++;
		
		System.out.println();
		
		Student1 studentPark=new Student1();
		studentPark.setStudentName("박창훈");
		System.out.println("이름 : "+studentPark.StudentName+"|아이디 : "+studentPark.serialNumber);
		Student1.serialNumber++;
		
		
	}

}
