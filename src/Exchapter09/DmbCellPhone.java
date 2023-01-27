package Exchapter09;

public class DmbCellPhone extends CellPhone {

	
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		
		this.channel = channel;
		this.color = color;
		this.model = model;
	}
	
	void tuㄱnOnDmb() {System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다");};
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다");};
	void turnOffDmb() {System.out.println("DMB 방송 수신을 멈춥니다");};	
	
	
	
	
	
}
