package Ch16;

interface Tire{
	void FL();
	void FR();
	void BL();
	void BR();
}
class HankookTire implements Tire{
	public void FL() {System.out.println("FL:한국타이어가굴러갑니다");}
	public void FR() {System.out.println("FR:한국타이어가굴러갑니다");}
	public void BL() {System.out.println("BL:한국타이어가굴러갑니다");}
	public void BR() {System.out.println("BR:한국타이어가굴러갑니다");}
}
class KumhoTire implements Tire{
	public void FL() {System.out.println("FL:금호타이어가굴러갑니다");}
	public void FR() {System.out.println("FR:금호타이어가굴러갑니다");}
	public void BL() {System.out.println("BL:금호타이어가굴러갑니다");}
	public void BR() {System.out.println("BR:금호타이어가굴러갑니다");}
}
class Car{
	Tire FL;
	Tire FR;
	Tire BL;
	Tire BR;
	public Car(Tire fL, Tire fR, Tire bL, Tire bR) {
		super();
		FL = fL;
		FR = fR;
		BL = bL;
		BR = bR;
	}
	void Run() {
		FL.FL();
		FR.FR();
		BL.BL();
		BR.BR();
	}
}
public class C02main {
	public static void main(String[] args) {
		Car car1=new Car(
				new HankookTire(),
				new HankookTire(),
				new HankookTire(),
				new HankookTire()
				);
		car1.Run();	
		System.out.println();
		car1.FL=new KumhoTire();
		car1.BR=new KumhoTire();
		car1.Run();
	}
}
