package Ch08;

public class C01CarMain {

	public static void main(String[] args) {
		C01Car hong = new C01Car();
		hong.owner="홍길동";
		hong.speed=0;
		hong.fuel=100;
		System.out.println("소유자 : " + hong.owner);
		System.out.println("현재속도 : " + hong.speed);
		System.out.println("연료량 : " + hong.fuel);
		

	}

}
