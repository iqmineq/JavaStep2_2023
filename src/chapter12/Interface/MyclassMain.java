package chapter12.Interface;

public class MyclassMain {

	public static void main(String[] args) {


		//X,y, MyInerface  클래스 타입의 인스턴스 변수를 선언하여 출력 
		
		
	Myclass mClass=new Myclass();
	
	  X xClass=mClass;
	  xClass.x();
	  System.out.println("---------------------");
		
	  
	  Y yClass=mClass;
	  yClass.y();
	  System.out.println("---------------------");
	  
	  
	  Myinterface iClass=mClass;
	  iClass.myMethod();
	  iClass.x();
	  iClass.y();
	
	}

}
