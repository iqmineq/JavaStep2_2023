package chapter18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {

        // Map<String Integer>생성 map
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		//팀원 데이터(성함, 학번)저장
		
		map.put("하영", 20);
		map.put("진혁", 21);
		map.put("혜경", 22);
		map.put("화진", 23);
		map.put("현수", 24);
		map.put("진학", 25);
		
		
		//팀원이 인원
		System.out.println("총 인원 수 : " + map.size());
		//팀장의 학번을 알아내자
		
		System.out.println("팀장 학번");
	    System.out.println(map.get("현수"));
		System.out.println();
		//팀원 모두의 학번 출력
		
		
		Set<String> keySet=map.keySet();
		Iterator<String>keyIterator=keySet.iterator();
		 while(keyIterator.hasNext()) {
			 String key=keyIterator.next();
			 Integer value = map.get(key);
			 
			 System.out.println("\t"+key+":"+value);
		 }
		System.out.println();
		
		

		
		
		

	}

}
