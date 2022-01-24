package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
		//단순 IF

//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : " );
//		int num = sc.nextInt();
//		
//		if(num%2==0) 	//짝수인가?
//		{
//			//참인경우 실행 코드블럭
//			System.out.println(num+" 은 짝수입니다");
//		}
//		System.out.println("프로그램을 종료합니다");
		
		// 문제
		//정수 하나 입력받아서 3의배수이면 'n은 3의 배수입니다' 출력
		//3의 배수이면서 4의 배수이면 'n은 3의배수이면서 4의배수입니다'출력(조건식&&조건식)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : " );
//		int num = sc.nextInt();
//		if(num%3==0) {
//			System.out.println(num + " 은 3의 배수입니다");
//		}
//		if(num%3==0&&num%4==0) {
//			System.out.println(num+" 은 3의배수 이면서 4의 배수입니다");
//		}
	
		//두수를 입력받아 큰수를 출력 if문으로만 해결

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 2개 입력 : ");
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		
//		if(n1>n2){
//			System.out.println("큰수 : " + n1);
//		}
//		if(n1<=n2){
//			System.out.println("큰수 : " + n2);
//		}
//		
//		System.out.println("프로그램이 종료됩니다");
		
		
		
		//if-else문(하나의 조건식을 기준으로 참인경우 종속문장,거짓인 경우 종속문장)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println("IF문시작-------------");
		if(n1>n2){
			System.out.println("큰수 : " + n1);
		}
		System.out.println("중간코드 삽입가능");
		if(n1<=n2){
			System.out.println("큰수 : " + n2);
		}
		System.out.println("IF문 끝----------------");
		
		System.out.println("IF-ELSE 문 시작-------------");
		if(n1>n2){
			System.out.println("큰수 : " + n1);
		}
		//System.out.println("중간코드 삽입불가능");
		else{
			System.out.println("큰수 : " + n2);
		}		
		System.out.println("IF-ELSE 문 끝-------------");
		System.out.println("프로그램이 종료됩니다");	
		
		
		
		

	}

}
