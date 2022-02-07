package Ch09;

class Ramen{
	//1물을끓인다				- step1():void
	//2스프와 분말가루를 넣는다	- step2():void
	//3면을넣는다				- step3():void
	//4파,계란~				- step4():void
	private void step1() {System.out.println("1 물을끓인다");}
	private void step2() {System.out.println("2 스프와 분말가루를 넣는다");}
	private void step3() {System.out.println("3 면을넣는다");}
	private void step4() {System.out.println("4 파,계란~");}
	//캡슐화함수				+ recp():void
	public void recp() {
		step1();step2();step3();step4();
	}
}
class Tokbokki{
	//1물을끓인다				- step1():void
	//2고추장을푼다				- step2():void
	//3떡오뎅넣는다				- step3():void
	//4졸인다					- step4():void
	private void step1() {System.out.println("1물을끓인다");}
	private void step2() {System.out.println("2고추장을푼다");}
	private void step3() {System.out.println("3떡오뎅넣는다");}
	private void step4() {System.out.println("4졸인다");}
	//캡슐화함수				+ recp():void
	public void recp() {
		step1();step2();step3();step4();
	}
}
class Chef{
	//Ramen과 의존관계 형성
	//Tokbokki와 의존관계 형성
	private Ramen ramen = new Ramen();
	private Tokbokki tokbokki = new Tokbokki();

	//+CookRamen():void ->Ramen조리과정이 출력!
	public void CookRamen() {
		System.out.println("-----라면 요리를 시작합니다-----");
		ramen.recp();
		System.out.println("-----라면 요리가 끝났습니다-----");
	}
	//+CookTokbokki:void -> Tokbokki조리과정이 출력!	
	public void CookTokbokki() {
		System.out.println("-----떡볶이 요리를 시작합니다-----");
		tokbokki.recp();
		System.out.println("-----떡볶이 요리가 끝났습니다-----");
	}
}
public class C04CapsuleMain {
	public static void main(String[] args) {
		Chef hong = new Chef();
		hong.CookRamen();
		hong.CookTokbokki();

	}

}
