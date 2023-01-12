package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class BankMain {

	public static void main(String[] args) {
	    //방법1
		Bank bk1=new Bank("강남점","010-1111-1111");
	    
	    //bk1.interest=0.2f;
	    Bank.interest=0.2f;
	    bk1.getBank();
		System.out.println("----------------------------");
		
		Bank kb2=new Bank("일산점","010-1111-4444");
		kb2.getBank();
		
		//방법2
		
		String point=null;
		String tel=null;
		Scanner s= new Scanner(System.in);
		
		point=JOptionPane.showInputDialog("지점명");
		tel=JOptionPane.showInputDialog("전화번호");
		Bank bank=new Bank(point, tel);
		
		System.out.println(point + "의 이자를 입력하시오 : ");
		Bank.interest=s.nextFloat();
		
		bank.getBank();

	}

}
