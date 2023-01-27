package chapter21.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Person implements Serializable{
	
	private static final long serialVershionUID = 1L;
	
	String name; 
	String job;
	//transient String number;
	//transient :직렬화 하지 않겠다 ( byte로 변환하지 않곘다)
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+ ","+job;
	}
	
	
	
}





public class serializationTest {
public static void main(String[] args) {


	Person personHong = new Person("홍길동" ,  "대표이사");
	Person personKim = new Person("김연아" ,  "상무이사");
	
	/*
	 * ObjectOutputStream : 파일이나 네트워크로 데이터를 전달하기 위해 직렬화를 수행해줌
	   WriteObject() : 직렬화 함수
	 */
	 
	//=========================== 직렬화========================================
	try (FileOutputStream fos =new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
		
		
		//직렬화
		oos.writeObject(personHong);
		oos.writeObject(personKim);
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	//------------------------------------역직렬화-------------------------------------

	/*
     ObjectInputStream: 파일이나 네트워크를 통해 전달 받은 직렬화된 데이터를 다시 원래대로 돌린리는 역활
     readObject() : 역직렬화에 사용되는 메소드
     직렬화 하기전 객체 캐스팅해줘야 함
 	*/
	try (FileOutputStream fis =new FileOutputStream("serial.out");
			ObjectOutputStream ois = new ObjectOutputStream(fis)) {
		
		
	Person p1=(Person)ois.readObject();
	Person p2=(Person)ois.readObject();
		
	System.out.println(p1);
	System.out.println(p2);
	
	} catch (Exception e) {
		
	}




}//main
}
