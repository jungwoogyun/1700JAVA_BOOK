package Ch08;

//생성자 함수 오버로딩?OK

class C10Simple{
	//속성
	int x;
	int y;
	//생성자
	C10Simple(){
		
		System.out.println("C10Simple()생성자호출!");
	}	//디폴트
	C10Simple(int x){
		this.x=x;	//this:내장형 참조변수
		this.y=0;
		System.out.println("C10Simple(int x)생성자호출!");
	}
	C10Simple(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println("C10Simple(int x,int y)생성자호출!");
	}
	//기능
	void ShowXY() {
		System.out.printf("%d,%d\n", x,y);
	}
}

public class C10ConstructorMain {

	public static void main(String[] args) {
		
		C10Simple ob1 = new C10Simple(); //디폴트생성자
		ob1.ShowXY();
		C10Simple ob2 = new C10Simple(10);
		ob2.ShowXY();
		C10Simple ob3 = new C10Simple(10,20);
		ob3.ShowXY();
	}

}
