package Exchapter09;

public class ParentMain {

	public static void main(String[] args) {

		
		
		ChildExam c1=new ChildExam();
		
		System.out.println(c1.getCar());
        System.out.println(c1.getMoney());//상속받은 재산
	
	
	//------------------------------
        
        if(c1 instanceof ParentExam) {
        	System.out.println("c1은 ParntExam의 자식 클래스 입니다");
            System.out.println(c1.getMoney());
        }
	
        
        
        //--------------------------
        
        //형변환
        
        ChildExam ch=new ChildExam();
        ParentExam p1=new ParentExam();
        System.out.println("--------------------");

        
        //부모=자식
        p1=ch;//자동형변환
       System.out.println(p1.getMoney()); 
       System.out.println(p1.getStr());
        System.out.println("-----------------");
	
        ch=(ChildExam)p1;//명시적형변환
        System.out.println(ch.getCar());
        System.out.println(ch.getMoney());
	    System.out.println(ch.getStr());
	}

}
