package chapter13;

public class StaticInner {

	int a= 10;
	private int b=100;
	static int c=200; //Data 영역 메모리
	
	
	//생성자
	//메소드
	//내부 클래스
	
	
	
	static class Inner{
		//필드
		static int d=1000;
		
		//생성자
		//메소드
		
		public void printData() {
		//a와 b는 static이 아니어서 데이터 영역에서 사용 할수 없음
		//System.out.println("int a :"+a);			
		//System.out.println("private b :"+b);			
	     System.out.println("static c :"+c);		
		}

	
		
	}
	
	
	
	
	public static void main(String[] args) {

        Inner inner=new Inner();
        inner.printData();
	    
       
	
	}

}
