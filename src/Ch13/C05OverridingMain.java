package Ch13;

//오버라이딩
//상위클래스로 부터 물려받은 매서드를 
//하위클래스에 재정의하는 방식
//매서드의 헤더는 고정으로 두고
//매서드의 본체{}를 수정을 허용


//오버로딩 vs 오버라이딩

//오버로딩? 함수의이름은 고정, 매개변수와 반환형은 변하도록 허용한 문법
//		  상속을 전제로 하지않는다

//오버라이딩? 상속관계를 전제로 하여 상위클래스로부터 물려받은 매서드의
//			헤더(머리)는 고정,본체({})는 수정할수도있도록 허용하는 분법

class Animal{
	public void Sound() {System.out.println("소리를 냅니다!");}
}
class Dog extends Animal{
	public void Sound() {System.out.println("멍멍 소리를 냅니다!");}
}
class Cat extends Animal{

	@Override
	public void Sound() {
		System.out.println("야옹 소리를 냅니다!");
	}
	
	
}
public class C05OverridingMain {
	public static void main(String[] args) {
		Dog poppi = new Dog();
		poppi.Sound();
		Cat yummi = new Cat();
		yummi.Sound();
	}

}
