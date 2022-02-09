package Ch13;



class Super{
	int x;
	Super(){System.out.println("Super클래스 생성자 호출!");}
	
	void ShowX() {
		System.out.println("X = " + x);
	}
}
class Sub extends Super{
	int y;
	Sub(){System.out.println("Sub클래스 생성자 호출!");}
	
	void ShowXY() {
		ShowX();
		System.out.println("Y = "+y);
	}
}
public class C01InheritanceMain {
	public static void main(String[] args) {
		
		Sub obj = new Sub();
		obj.y=10;
		obj.x=20;
		
		obj.ShowX();
		System.out.println();
		obj.ShowXY();
		
		
	}

}
