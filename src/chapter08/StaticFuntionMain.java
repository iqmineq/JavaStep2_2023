package chapter08;

public class StaticFuntionMain {

	public static void main(String[] args) {
		
		
		
		StaticFuntion St=new StaticFuntion();
		System.out.println(St.str2);
		String s=St.getStatic();
		System.out.println(s);
         
		//static 메소드는 클레스명으로 접근이 가능
		String str;
		str=StaticFuntion.getStatic();
		
		System.out.println(str);
		
		
	}

}
