package chapter12.MultiInterface;

public class interMenuMain implements Inter_Menu3{

	public static void main(String[] args) {
		
		interMenuMain im= new interMenuMain();
		//부모=자식
		
		Inter_Menu1 im1=im;//업캐스팅
		Inter_Menu2 im2=im;//업캐스팅
		Inter_Menu3 im3=im;//업캐스팅
		System.out.println("------------Inter_Menu1");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		System.out.println();
		System.out.println("------------Inter_Menu2");
		System.out.println(im2.tangsuyuck());
		System.out.println("------------Inter_Menu3");
		System.out.println(im3.boggembab());

	}

	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "하나 죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "해장하세요";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "맛있음";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "작살남";
	}

}
