package Ch09;

//this 
//객체 내에 존재하는 내장참조변수(객체의 주소저장)
//this 용도
//1 매개변수 와 멤버변수 구별
//ex) this.x = x;
//2 생성자 오버로딩에서 특정한 생성자를 호출

class C05Simple{
	//속성
	int x;
	int y;
	int z;
	
	//생성자 오버로딩
	C05Simple(){
		//x=0;y=0;z=0;
		this(0,0,0); //x,y,z모두 받는 생성자 호출
	}
	//x만 받는 생성자,나머지는 0
	C05Simple(int x){
//		this.x=x;
//		y=0;
//		z=0;
		this(x,0,0);//x,y,z모두 받는 생성자 호출
	}
	//x,y만 받는 생성자, z는 0
	C05Simple(int x , int y){
//		this.x=x; 
//		this.y=y;
//		z=0;
		this(x,y,0);
	}
	//x,y,z모두 받는 생성자
	C05Simple(int x , int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void ShowXYZ() {
		System.out.printf("%d %d %d\n",x,y,z);
	}
}

public class C05ThisMain {
	public static void main(String[] args) {
		C05Simple ob1 = new C05Simple(); ob1.ShowXYZ();
		C05Simple ob2 = new C05Simple(10); ob2.ShowXYZ();
		C05Simple ob3 = new C05Simple(10,20); ob3.ShowXYZ();
		C05Simple ob4 = new C05Simple(10,20,30); ob4.ShowXYZ();

	}

}
