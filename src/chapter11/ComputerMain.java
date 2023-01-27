package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		//추상클래스는 객체를 만들수 없다
		//Computer c1=new Computer(); 
		//Computer c3=new NoteBook();
		
		Computer c2=new DeskTop();
		Computer c4=new MyNoteBook();
        c2.typing();//Desktop
        c2.dispaly(); //Desktop
        c4.dispaly();//NoteBook
        c4.typing(); //MyNoteBook
		
		

	}

}
