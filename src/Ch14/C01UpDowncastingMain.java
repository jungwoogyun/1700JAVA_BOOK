package Ch14;

//Upcasting 
//casting :클래스 형변환
//Upcasting 
//상위클래스 참조변수 = (상위클래스)하위객체 
//C01Super ob = new C01Sub();
//클래스 자료형이 다를때 컴파일러에의해 자동으로 자료형이 일치되는 현상

//UPcasting 사용이유
//
class C01Super{
	int x;
}
class C01Sub extends C01Super{
	int y;	//확장
}
public class C01UpDowncastingMain {
	public static void main(String[] args) {
		//Nocasting
		C01Super ob1 = new C01Super();
		C01Sub ob2 = new C01Sub();
		
		//Upcasting(상위클래스 참조변수 = 하위객체)
		C01Super ob3 = new C01Sub();
		ob3.x=100;
		//ob3.y=200; //하위클래스의 확장된 부분에는 접근 X
		
		//DownCasting(하위클래스 참조변수 = 상위객체)
		//->Upcasting 상태에서 확장된 멤버에 접근하기 위함
		C01Sub down = (C01Sub)ob3;
		down.x=100;
		down.y=200;	//확장된 부분에 접근가능!!
		
		
		
		

	}

}
