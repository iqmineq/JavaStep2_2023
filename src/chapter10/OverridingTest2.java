package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {
public static void main(String[] args) {
	
	//분모=자식 (자동 형변환)
	Customer vs=new VIPCustomer(10004, "김치", 20000);
			System.out.println(vs.showCustomer());
}
}
