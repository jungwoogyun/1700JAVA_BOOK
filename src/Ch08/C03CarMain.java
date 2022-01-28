package Ch08;

class C03Car{
	String owner;
	int speed;
	int fuel;
	void Accel() {
		
		speed+=10;
		fuel-=5;
		System.out.println(owner + " 님의 차가 가속됩니다.현재속도:"+speed+"km/h");
	}
	void Break() {
		speed-=5;
		System.out.println(owner + " 님의 차가 감속됩니다.현재속도 : "+speed+"km/h");
	}
	void ShowInfo() {
		System.out.println("소유자 : " + owner);
		System.out.println("현재속도 : " + speed);
		System.out.println("연료량 : " + fuel);
	}
}
public class C03CarMain {
	public static void main(String[] args) {
		C03Car hong = new C03Car();
		hong.owner="홍길동";
		hong.speed=0;
		hong.fuel=100;
		hong.Accel();hong.Accel();hong.Accel();hong.Accel();hong.Accel();
		hong.Break();
		hong.ShowInfo();
	}

}
