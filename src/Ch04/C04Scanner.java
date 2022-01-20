package Ch04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : " );
		String name=sc.nextLine();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		sc.nextLine();//버퍼에 있는 \n 건너뛰기
		System.out.print("주소 입력 : " );
		String addr = sc.nextLine();
		
		System.out.printf("이름:%s 나이:%d 주소:%s\n",name,age,addr);
		
		
		
		
		
	}

}
