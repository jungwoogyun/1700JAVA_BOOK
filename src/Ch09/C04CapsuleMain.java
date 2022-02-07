package Ch09;



class Ramen{
	//1물을끓인다				- step1():void
	//2스프와 분말가루를 넣는다	- step2():void
	//3면을넣는다				- step3():void
	//4파,계란~				- step4():void	
	//캡슐화함수				+ recp():void
}
class Tokbokki{
	//1물을끓인다				- step1():void
	//2고추장을푼다				- step2():void
	//3떡오뎅넣는다				- step3():void
	//4졸인다					- step4():void
	//캡슐화함수				+ recp():void
}
class Chef{
	//Ramen과 의존관계 형성
	//Tokbokki와 의존관계 형성

	//+CookRamen():void ->Ramen조리과정이 출력!
	//+CookTokbokki:void -> Tokbokki조리과정이 출력!	
}
public class C04CapsuleMain {
	public static void main(String[] args) {
		Chef hong = new Chef();
		hong.CookRamen();
		hong.CookTokbokki();

	}

}
