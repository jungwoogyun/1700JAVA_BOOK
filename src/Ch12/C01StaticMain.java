package Ch12;


//자바의 메모리 구조
//1) 스택영역			:	{}내의 생성/소멸 지역변수 
//2) 힙영역			:	new 예약어를 통해 생성,소멸은 JVM의 가비지컬렉터에 의해 자동 소멸
//3) 클래스(매서드)영역 :  	프로그램이 시작됨과 동시에 생성, 종료시 소멸
//						static변수, static함수, 생성자함수, 일반멤버함수

class C01Simple{
	static int num1;	//공유변수
	int num2;
	void ShowNum() {
		System.out.println("NUM1 : " + num1 + " NUM2 : " + num2);
	}
}
public class C01StaticMain {
	public static void main(String[] args) {

		C01Simple obj1 = new C01Simple();
		obj1.num1=10;
		obj1.num2=20;
		C01Simple obj2 = new C01Simple();
		obj2.ShowNum();
		System.out.println("-------");
		obj2.num1=100;
		obj2.num2=200;
		obj1.ShowNum();
		System.out.println("-------");
		C01Simple.num1=1234;
		obj1.ShowNum();
		obj2.ShowNum();
		
	}

}
