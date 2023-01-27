package chapter14.hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		

	    //key 객체를 식별키로 사용해서 String값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap=new HashMap<Key, String>();
	
	    System.out.println(hashMap);
		
		//식별키의 객체를 이용하여 이름을 변환
		hashMap.put(new Key(1), "홍길동");
		System.out.println(hashMap);
		hashMap.put(new Key(1), "홍길동");
		System.out.println(hashMap);
	
	}
	

}
