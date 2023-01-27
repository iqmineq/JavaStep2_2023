package chapter13;

import java.util.Scanner;

public class EnumMain {
       
	   private enum Item {start,pause,Exit} //0 1 2

	
	
	
	
	public static void main(String[] args) {
	
		
		while(true) {
			Scanner scan= new Scanner(System.in);
			System.out.println("숫자를 이력하세요[0: 게임시작 , 1: 일시정지, 2: 게임종료] :");
			
			int n=scan.nextInt();
			
			
			Item start =Item.start;//start에 0
			Item pause =Item.pause;//pause에 1
			Item Exit =Item.Exit;//Exit에 2
			
			if(n==start.ordinal())//n== 0
				System.out.println("게임이 시작함");
			else if(n==pause.ordinal())
				System.out.println("게임이 일시정지");
			else {
				System.out.println("게임 종료");
			   return;
			}
		}

	}

}
