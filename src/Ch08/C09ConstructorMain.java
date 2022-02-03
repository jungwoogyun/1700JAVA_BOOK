package Ch08;

//생성자
//객체 생성시에 멤버의 초기값을 설정하는데 사용되는 매서드(함수)
//생성자매서드는 반환자료형을 가지지 않고 클래스명과 동일하다
//객체생성시에 한번 호출
//Simple obj = new Simple();

class C09Simple
{
	//속성
	int x;
	//기능
	C09Simple(){
		System.out.println("디폴트 생성자 호출!");
	}
}

public class C09ConstructorMain {
	public static void main(String[] args) {
		C09Simple obj = new C09Simple();
		System.out.println("obj.x = "+obj.x);
	}

}
