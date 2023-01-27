package chapter10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		
		SupersonicAirplane ss=new SupersonicAirplane();
		
		ss.takeoff();
		ss.fly();
		ss.flyMode=SupersonicAirplane.SUPERSONIC;
		ss.fly();
		ss.flyMode=SupersonicAirplane.NORMAL;
		ss.fly();
		ss.land();
		

	}

}
