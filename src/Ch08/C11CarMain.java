package Ch08;

class C11Car{
	//속성
	//+owner : String
	//+speed : int;
	//+fuel : int;
	public String owner;
	public int speed;
	public int fuel;
	//생성자
	//모든 멤버에 초기값을 저장할 수있도록 하는 생성자 기입
	C11Car(String owner,int speed,int fuel){
		this.owner=owner;
		this.speed=speed;
		this.fuel=fuel;
	}
	//기능
	void Accel() {System.out.println("가속합니다!");}
	void Break() {System.out.println("감속합니다!");}
	void ShowInfo() {
		System.out.println("소유자 : " +this.owner);
		System.out.println("현재속도 : " + this.speed);
		System.out.println("연료량 : " + this.fuel);
	}
	//Accel():void
	//Break():void
	//ShowInfo():void 
	
}
public class C11CarMain {
	public static void main(String[] args) {
		
		C11Car hong = new C11Car("홍길동",0,100);
		C11Car jung = new C11Car("정우균",0,100);
		
		hong.Accel();		//'가속합니다' 가 출력
		hong.Break();		//'감속합니다' 가 출력
		hong.ShowInfo();	//소유자,현재속도,연료량 출력

	}

}
