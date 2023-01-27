package chapter16.gerneric2;

public class GernericPrinterMain {

	
	public static void main(String[] args) {


		GenericPrinter<Powder> printerPowder= new GenericPrinter<Powder>();
		
		Powder p1=new Powder();
		printerPowder.setMaterial(p1);
		System.out.println(p1);
		
		
	    Powder p2 =(Powder)printerPowder.getMaterial();
		System.out.println(p2);

		
		ThreeDPrinter printerPlastic = new ThreeDPrinter();
		Plastic p3=new Plastic();
		printerPowder.setMaterial(p3);
		System.out.println(p3); 
		
		Plastic p4 =(Plastic)printerPlastic.getMaterial();
		System.out.println(p4);
		

	}
	
	
}
