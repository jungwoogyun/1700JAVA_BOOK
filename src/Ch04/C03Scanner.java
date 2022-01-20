package Ch04;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
		System.out.println("-------Scanner TEST-------");
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("정수확인 : " + num1);
//		
//		System.out.print("실수 입력 : " );
//		double num2 = sc.nextDouble();
//		System.out.println("실수확인 : " + num2);
//		
//		System.out.print("문자열입력 : ");
//		String str1 = sc.next();
//		System.out.println("문자열 확인 : " + str1);
		
		System.out.println("문자열입력(띄어쓰기포함) : ");
		String str2 = sc.nextLine();
		System.out.println("문자열 확인 : " + str2);
		
		
		

	}

}
