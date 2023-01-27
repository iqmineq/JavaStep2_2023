package chapter17.arrayList;

import java.util.ArrayList;

import Exchapter09.AnimalTest;

class Animal{
public void move() {
	System.out.println("동물이 움직입니다.");
}
}

class Human extends Animal {
    	
	    public void move() {
			 System.out.println("사람은 두발로 걷습니다.");
		}	

	    public void readBook() {
			System.out.println("사람은 책을 읽습니다");
		}
}

class Tiger extends Animal {
	    	
		    public void move() {
				 System.out.println("호랑이가 네발로 걷습니다");
			}	
	
		    public void hunting() {
				System.out.println("호랑이는 사냥을 합니다");
			}
}   
class Eagle extends Animal {
		    	
			    public void move() {
					 System.out.println("독수리가 하늘을 납니다");
				}	
		
			    public void flying() {
					System.out.println("독수리가 날개를 펴고 날아 다닙니다");
				}    
	   
}  








ArrayList<Animal> aniList = new ArrayList<>(); 

public void addAnimal() {
	aniList.add(new Human());
	aniList.add(new Tiger());
	aniList.add(new Eagle());
	
	for (var ani : aniList) {
		ani.move();
	}
}

public void testCasting() {
	for (var iter = aniList.iterator(); iter.hasNext();) {
		var ani = iter.next();
		
		if (ani instanceof Human) {
			((Human) ani).readBook();
		} else if (ani instanceof Tiger) {
			((Tiger) ani).hunting();
		} else if (ani instanceof Eagle) {
			((Eagle) ani).flying();
		} else {
			System.out.println("지원되지 않는 타입입니다.");
		}
	}
}
	
	
	
	public static void main(String[] args) {
		
	   AnimalTest aTest=new AnimalTest();
		aTest.addAnimal();
		System.out.println("-----다운캐스팅------");
		aTest.

	}

}
