package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java은", "검정",10);
		
		//CellPhone으로 부터 상속받은 필드 출력
	   
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상"+dmbCellPhone.color);
		
		
		
		//DmbCellPhone의 필드 출력
		
	  System.out.println("채널: "+dmbCellPhone.channel);
	    
	    
	    
		
		//CellPhone의 메소드를 사용하여 전화통화 구현
	    CellPhone cellphone = new CellPhone();
	    cellphone.powerOn();
	    cellphone.bell();
	    cellphone.hangUp();
	    cellphone.sendVoice("여보세요?");
	    cellphone.receiveVoice("잘못걸었습니다");
	    cellphone.sendVoice("ㅇㅋ");
	    cellphone.powerOff();
	    
	    
		
		//DmbCellPhone의 메소드를 사용하여 채널을 바꾸기
	    
	    dmbCellPhone.turnOnDmb();
	    dmbCellPhone.changeChannelDmb(5);
	    dmbCellPhone.turnOffDmb();
		

	}

}
