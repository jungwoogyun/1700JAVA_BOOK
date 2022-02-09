package Ch13;

//a IS A b = ~이다 a는 b이다  (b상위, a하위)
//a HAS A b = a는 b를 소유한다 (b상위, a하위)

class Computer{
	String SN;
	String CPU;
	String RAM;
	String DISK;
	//생성자x ->디폴트생성자
	Computer(){System.out.println("Computer디폴트생성자 호출!");}
	void PowerON() {System.out.println("전원ON!");}
	void PowerOFF() {System.out.println("전원OFF!");}
}
class Notebook extends Computer{
	int battery; //확장멤버
	Notebook(){System.out.println("Notebook디폴트 생성자 호출!");}
	void Move() {System.out.println("이동!");}
}
public class C02InheritanceMain {
	public static void main(String[] args) {
		Notebook LGGram123 = new Notebook();
		LGGram123.PowerON();
		LGGram123.Move();
		LGGram123.PowerOFF();

	}

}
