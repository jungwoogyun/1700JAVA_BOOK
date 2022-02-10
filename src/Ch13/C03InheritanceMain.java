package Ch13;

class C03Super{
	int x;
	int y;
	C03Super(){System.out.println("C03Super() 생성자호출");}
	C03Super(int x){
		this.x=x;
		System.out.println("C03Super(int x) 생성자호출");
	}
	C03Super(int x,int y){
		this.x=x;this.y=y;
		System.out.println("C03Super(int x,int y) 생성자호출");
	}
}
class C03Sub extends C03Super{
	int z;
	C03Sub(){
		super();//상위클래스 C03Super(){} 호출!
		System.out.println("C03Sub() 생성자 호출");
		}
	C03Sub(int x){
		super(x);//상위클래스 C03Super(int x)생성자 호출!
		System.out.println("C03Sub(int x) 생성자 호출");
	}
	C03Sub(int x , int y){
		super(x,y);//상위클래스 C03Super(int x,int y)생성자 호출!
		System.out.println("C03Sub(int x,int y) 생성자 호출");
	}
	C03Sub(int x , int y,int z){
		super(x,y);//상위클래스 C03Super(int x,int y)생성자 호출!
		this.z=z;
		System.out.println("C03Sub(int x,int y) 생성자 호출");
	}
	public void ShowXYZ() {
		System.out.printf("%d %d %d\n", x,y,z);
	}
}
public class C03InheritanceMain {
	public static void main(String[] args) {
		C03Sub ob1 = new C03Sub();
		ob1.ShowXYZ();System.out.println();
		C03Sub ob2 = new C03Sub(10);
		ob2.ShowXYZ();System.out.println();
		C03Sub ob3 = new C03Sub(10,20);
		ob3.ShowXYZ();System.out.println();
		C03Sub ob4 = new C03Sub(10,20,30);
		ob4.ShowXYZ();System.out.println();

	}

}
