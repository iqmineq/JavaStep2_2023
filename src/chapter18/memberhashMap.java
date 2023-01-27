package chapter18;

import java.util.HashMap;

import chapter17.Member;

public class memberhashMap {

	public static void main(String[] args) {
		
		
		
		private HashMap<Integer, String> hashMap;
		
		public MemberHashMap() {
			
			hashMap=new HashMap<Integer, String>();
		}

		public void addMember(Member member) {
			
			hashMap.put(member.getMemberId(),member.getMemberName());
			
		}
		
		
		
		
		
		
	}

}
