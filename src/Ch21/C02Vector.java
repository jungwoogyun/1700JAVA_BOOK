package Ch21;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Profile{
	String name;
	int age;
	char gender;
	//생성자
	public Profile(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	//ToString()
	@Override
	public String toString() {
		return "Profile [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
public class C02Vector {
	public static void main(String[] args) {
		
		List<Profile> list = new Vector();
		Scanner sc = new Scanner(System.in);
		
		String name=null;
		int age=0;
		char gender='\0';
		Profile tmp=null;
		
		//값 저장
		for(int i=0;i<3;i++) {
			//키보드로 값받기
			System.out.print("이름 : ");
			name=sc.next();
			System.out.print("나이 : ");
			age=sc.nextInt();
			System.out.print("성별 : ");
			gender=sc.next().charAt(0);
			//전달받은값으로 임시 Profile객체 생성
			tmp=new Profile(name,age,gender);
			//리스트에 추가
			list.add(tmp);
			System.out.println();
		}
		//데이터 확인
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s , %d , %c\n", list.get(i).name,list.get(i).age,list.get(i).gender);
		}
		
		

	}

}
