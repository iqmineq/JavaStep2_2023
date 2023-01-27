package chapter10;

public class AnimalMain {
public static void main(String[] args) {
	
	System.out.println("-------곰---------");
	Bear b = new Bear();

	System.out.println("곰의 눈의 갯수: " + b.getEye());
	System.out.println("곰의 다리의 갯수: " + b.getLeg());
	System.out.println("곰의 특징: " + b.woong);

	System.out.println("------사자---------");
	Lion l = new Lion();

	System.out.println("사자의 눈의 갯수: " + l.getEye());
	System.out.println("사자의 다리의 갯수: " + l.getLeg());
	System.out.println("사자의 특징 : " + l.galgi);

	System.out.println("------거미---------");
	Spider s = new Spider();

	System.out.println("거미 눈 갯수:" + s.getEye());
	System.out.println("거미 다리 갯수:" + s.getLeg());
	System.out.println("거미특징 : " + s.web);


}
}  
    



