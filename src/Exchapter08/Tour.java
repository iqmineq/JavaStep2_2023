package Exchapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		System.out.println("관광객 수: ");
		int n = scan.nextInt();
		
		Guide guide=new Guide(n);
		System.out.println("관광객등록");
        for(int i=0; i<n; i++) {
        	System.out.println((i+1)+", 이름 :");
        	String name=scan.nextLine();
            guide.guest[i].setName(name); 
            System.out.println((i+1)+", 성별 : ");
        	String gender=scan.nextLine();
        	guide.guest[i].setGender(gender);
        }
      
        while(run) {
        	
        	System.out.println("1, 관광객 정보");
        	System.out.println("2, 목적지 변경");
        	System.out.println("1, 종료");
            System.out.println("--------------");        	
        	
        	int z= scan.nextInt();
        	
        	switch (z) {
			case 1: 
				for(int i=0; i<n; i++) {
					System.out.println((i+1)+",이름 :"+guide.guest[i].getName());
					System.out.println((i+1)+",성별 :"+guide.guest[i].getGender());
					System.out.println((i+1)+",목적지 :"+guide.guest[i].getPoint());
				    System.out.println("-------------------------------------------");
				}
				
				break;
           case  2:
        	   System.out.println("어디로 변경하시겠습니까? : ");
				String change=scan.next();
				System.out.println(change+"로 목적지 변경");
				guide.point=change;
				break;
           case  3:
				
        	     System.out.println("종료");
        	     run=false;
        	   
				break;
				
			default:
				break;
			}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
 
        
        
        
	}

}
