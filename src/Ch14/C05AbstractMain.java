package Ch14;

//추상클래스
//추상매서드를 하나이상 포함하고 있는 클래스
//예약어 : abstract
//재정의된 함수에 Upcasting 참조변수 용으로만 사용
//추상클래스 자체로 객체를 생성할 수 없다

//이유?
//미완성된 매서드의 강제 재정의(매서드 이름의 통일성)
//비즈니스 로직구현에서 우선순위를 지정하기 위함



//일반 클래스 상속관계
class Par1{
	//일반매서드(헤더+본체,완성형매서드)
	void Sound() {} //로직은 없지만 헤더+본체 구성되어있음
}
class Son1 extends Par1{
	//Son1클래스는 Sound()를 그대로사용할수도 있고, 고쳐쓸수도(오버라이딩) 있다
		void Sound() {System.out.println("Son1의 Sound함수 호출!");} //오버라이딩
}
//추상 클래스 상속관계
abstract class Par2{
	int x;
	int y;
	abstract void Sound();	//미완성된 매서드..상속관계에 있는 하위클래스가 
							//반드시 재정의 해야만 사용가능!
}
class Son2 extends Par2{

	@Override
	void Sound() {
		System.out.println("Son2의 Sound()함수 호출!");
	}
}

public class C05AbstractMain {

	public static void main(String[] args) {
		//일반클래스 확인
		Par1 ob1 = new Par1(); //상위클래스로 객체 생성 가능!
		Son1 ob2 = new Son1(); //하위클래스로 객체 생성 가능!
		Par1 up = new Son1();	//업캐스팅 
		up.Sound(); //재정의된 하위 클래스의 Sound() 사용 할 수 있다!.
		
		//추상클래스 확인
		//Par2 obj1 = new Par2(); //추상클래스로 객체생성 불가능(미완성된 매서드포함되었기때문에)
		Son2 obj2 = new Son2();	//Sound()를 완성시킨 하위 클래스는 객체 생성 가능
		Par2 up2 = new Son2();	//Upcasting 가능!
		up2.Sound();//추상클래스 참조변수로 Upcasting을 한상태에서	
					//하위클래스에서 강제 재정의한 Sound()함수에 접근가능하다
	}

}
