package chapter11;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	

	//탬플릿 메소드( 재정의가 안되게 구현)
	public void startCar() {
		System.out.println("시동을 킵니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
		
	}
	   
}
