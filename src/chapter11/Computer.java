package chapter11;
//단하나라도 추상 메소드가 존재하면 반드시 abstract를 추가한다
public abstract class Computer {

	//추상 메소드 :Body가 없다
	
	public abstract void dispaly();//하위 클래스 구현해서 사용하려는 의미
	public abstract void typing();
	
	
	
	//일반메소드
	public void turn() {
		System.out.println("전원을 켭니다");
	}
   
	public void turnoff() {
		System.out.println("전원을 끕니다");
		
	}
}
