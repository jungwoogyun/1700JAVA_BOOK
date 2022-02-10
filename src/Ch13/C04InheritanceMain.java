package Ch13;

//a IS A b = ~이다 a는 b이다  (b상위, a하위)
//a HAS A b = a는 b를 소유한다 (b상위, a하위)

class C04Computer{
	String SN;
	String CPU;
	String RAM;
	String DISK;
	//생성자x ->디폴트생성자
	C04Computer(){System.out.println("Computer디폴트생성자 호출!");}
	C04Computer(String SN,String CPU, String RAM, String DISK){
		this.SN=SN;this.CPU=CPU;this.RAM=RAM;this.DISK=DISK;
	}
	void PowerON() {System.out.println("전원ON!");}
	void PowerOFF() {System.out.println("전원OFF!");}
}
class C04Notebook extends C04Computer{
	int battery; //확장멤버
	C04Notebook(){System.out.println("Notebook디폴트 생성자 호출!");}
	
	//생성자 완성하세요
	C04Notebook(String SN,String CPU,String RAM,String DISK,int battery){
		super(SN,CPU,RAM,DISK);
		this.battery=battery;
	}
	
	void Move() {System.out.println("이동!");}
}
public class C04InheritanceMain {
	public static void main(String[] args) {
		C04Notebook LGGram123 = new C04Notebook("1234","I7","16G","1T",100);
		LGGram123.PowerON();
		LGGram123.Move();
		LGGram123.PowerOFF();

	}

}
