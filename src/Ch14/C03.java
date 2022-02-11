package Ch14;


class C03Animal{
	void Sound() {System.out.println("소리를 냅니다!");}
}
class C03Dog extends C03Animal{
	void Sound() {System.out.println("멍멍 소리를 냅니다!");}//오버라이딩(함수재정의)
}
class C03Cat extends C03Animal{
	void Sound() {System.out.println("야옹 소리를 냅니다!");}//오버라이딩(함수재정의)
}

public class C03 {
	public static void main(String[] args) {
		C03Animal ani=null;
		
		ani=new C03Dog();	//Upcasting
		ani.Sound();
		System.out.println();
		ani=new C03Cat();	//Upcasting
		ani.Sound();		
		
		//UPcasting 정리
		//상속관계에서 상위클래스의 참조변수가 확장된 멤버에 접근할 수있다? X
		//->DownCasting 을통해서 각 하위클래스의 멤버에 접근!
		//상속관계에서 상위클래스의 참조변수가 오버라이딩된 멤버에 접근할 수 있다? O
		
		
	}
}
