package chapter17.treeset;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class MyCompare implements Comparable<String>{

	@Override
	public int compare(String s1 , String s2) {
		// TODO Auto-generated method stub
		return (s1.compareTo(s2))*-1;//내림차순
	}
	
	
}





public class ComparatorTest2 {

	public static void main(String[] args) {


		//default로 오버라이딩 되어 있는 String/ integer
		//Set<String> set= new TreeSet<String>();
		Set<String> set= new TreeSet<String>(new MyCompare());
		
		//내림차순
		
		set.add("aaa");
		set.add("ddd");
		set.add("hhh");
		set.add("bbb");

		
		
		System.out.println(set);
	}

}

