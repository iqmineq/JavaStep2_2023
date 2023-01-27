package chapter18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class StudentMain {

	public static void main(String[] args) {


		Map<Student, Integer> map=new HashMap<Student, Integer>();
		//학생정보 점수
		map.put(new Student(1,"홍길동"),95);
		map.put(new Student(1,"홍길동"),95);
		map.put(new Student(2,"김민주"),95);
		map.put(new Student(3,"서주희"),95);
		map.put(new Student(4,"하동길"),95);

		//중복 X
		
		System.out.println("총 Entry 수 :"+map.size());
		//하나씩 처리하는 방법
	      Set<Student> keySet=map.keySet();
	      Iterator<Student> keyIterator = keySet.iterator();

	      while (keyIterator.hasNext()) {
	         Student key = (Student) keyIterator.next();
	         Integer value=map.get(key);
	         System.out.println("\t"+key+" : "+value);
	      }
		
		
		
		
		Scanner scan=new Scanner(System.in);
		Student std;
		int input;
		String name;
		 while(true)
		 {
			 System.out.println("학생 번호를 입력하세요 : ");
			 input = scan.nextInt();
			 System.out.println("학생 이름을 입력하세요 : ");
			 name = scan.next();
			 std=new Student(intput.name);
			 
			 
			 if(map.containsKey(std)) {
				 System.out.println(name+" 학생의 점수는 :"+ map.get(std));
				 break;
				 
			 } else {
				 System.out.println("해당 학생의 데이터가 존재하지 않습니다");
			 }
				 
			 }
			 
			 
		 }
		
		
		
	}


