package Ch17;

class Animal{ void Sound(){System.out.println("소리를 냅니다");}}
class Dog extends Animal{
	 void Sound(){System.out.println("멍멍! 소리를 냅니다");}
}
class Cat extends Animal{}

public class C03CastingException {

	public static void main(String[] args) {
	
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Cat cat1 = new Cat();
		
		ChangeDog(dog1);//문제없음
		ChangeDog(cat1);//문제발생!
		ChangeDog(dog2);//문제없음
	}
	public static void ChangeDog(Animal ani) {
		try {
		Dog down = (Dog)ani; //Casting 예외
		down.Sound();
		
		}catch(ClassCastException e) {
			System.out.println("예외발생 : " + e.getCause());
		}
		
	}

}
