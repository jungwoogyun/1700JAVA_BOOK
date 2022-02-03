package Ch08;


//지역변수 : {}내에서 생성되는 변수,{}를 벗어나면 공간 소멸

class C08Simple{
	
	//멤버변수
	int num1;
	//멤버함수
	
	void Func1() {
		num1=10;	//멤버변수num1에 10값 저장
		System.out.println("num1 = " + num1);//멤버변수num1출력
		int num1=100;
		System.out.println("num1 = " + num1);//Func1안의 지역변수num1출력
	}
	void Func2() {
		num1+=10;	//멤버변수num1에 10값 누적
		System.out.println("num1 = " + num1);//멤버변수num1출력
		int num1=200;
		System.out.println("num1 = " + num1);//Func1안의 지역변수num1출력
	}
	void Func3() {
		num1=200;	//멤버변수(상위지역)
		if(true) {
			int num1=1010;	//지역변수(하위지역)
			System.out.println("num1 = " + num1);//if안의 num1출력
		}//if안의 num1이 소멸
		System.out.println("num1 = " + num1);//멤버변수 num1 
	}
}
public class C08LocalVarMain {
	public static void main(String[] args) {
		C08Simple obj = new C08Simple();
		obj.Func1();
		System.out.println();
		obj.Func2();
		
	}
}
