package Ch14;


class C04Animal{
	void Sound() {System.out.println("소리를 냅니다!");}
}
class C04Dog extends C04Animal{
	void Sound() {System.out.println("멍멍 소리를 냅니다!");}//오버라이딩(함수재정의)
}
class C04Cat extends C04Animal{
	void Sound() {System.out.println("야옹 소리를 냅니다!");}//오버라이딩(함수재정의)
}
class C04Tiger extends C04Animal{
	void Sound() {System.out.println("어흥 소리를 냅니다!");}//오버라이딩(함수재정의)
}
public class C04 {
	public static void main(String[] args) {
		
		Func(new C04Cat());System.out.println();
		Func(new C04Dog());System.out.println();
		Func(new C04Tiger());System.out.println();
	}
	public static void Func(C04Animal ani) //매개변수로 객체 받을때 UPcasting
	{
		ani.Sound(); //상위클래스에서 Sound()를 정의한것을 하위에서 재정의했기때문에
					 // 상위클래스로 만든 ani참조변수가 재정의한 Sound()접근 가능
	}

}
