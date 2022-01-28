package Ch08;


class C03Person{
	//속성
	String name;
	int age;
	//기능
	void talk() {
		System.out.println(name + " 님이 말합니다");
	}
	void walk() {
		System.out.println(name + " 님이 걷습니다");
	}
}

public class C03PersonMain {

	public static void main(String[] args) {
		C03Person hong=new C03Person();
		C03Person jung=new C03Person();
		hong.name="홍길동";
		jung.name="정우균";
		
		hong.talk();
		jung.walk();

	}

}
