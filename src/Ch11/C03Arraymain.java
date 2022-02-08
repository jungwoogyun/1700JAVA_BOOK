package Ch11;

import java.util.Scanner;

class Person{
	String name;
	int age;
	char gender;
	Person(){
		System.out.println("디폴트 생성자 호출!");
	}
}
public class C03Arraymain {

	public static void main(String[] args) {
		//클래스자료형으로 배열 만들때 주의할 점
		//클래스 자료형으로 배열을 생성 할때 배열의 각요소는
		//객체를 연결하기 위한 참조변수 이다
		//각 요소에 객체를 연결한 뒤 사용해야한다..
		
		
		Person [] list = new Person[3];
		
//		list[0]=new Person(); //!!!!
//		list[0].name="홍길동";
//		list[0].age = 50;
//		list[0].gender='남';
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<list.length;i++) {
			list[i]=new Person();
			System.out.print("이름 : " );
			list[i].name=sc.next();
			System.out.print("나이 : ");
			list[i].age=sc.nextInt();
			System.out.print("성별 : " );
			list[i].gender = sc.next().charAt(0);
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i=0;i<list.length;i++) {
			System.out.printf("%s %d %c\n", list[i].name,list[i].age,list[i].gender);
		}
		
		
		
		
		
		
	}

}
