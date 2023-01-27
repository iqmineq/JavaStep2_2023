package chapter15;

public class StringTest1 {

	public static void main(String[] args) {
	
		
		String javaStr=new String("Java ");//heap
		String android=new String(" androidStr");//heap
		System.out.println(javaStr);//toString
		System.out.println(javaStr.hashCode());//10진수
		System.out.println(System.identityHashCode(javaStr));//16진수
		
		
		javaStr=javaStr.concat(android);
		System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));//16진수
		
	}

}
