package Ch08;

public class C01Main {

	
	public static void main(String[] args) {
		
		//객체생성
		C01Person obj = new C01Person();
		obj.name="홍길동";
		obj.age=30;
		obj.gender='M';
		obj.weight=70.8F;
		obj.height=177.4;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.gender);
		System.out.println(obj.weight);
		System.out.println(obj.height);

	}

}
