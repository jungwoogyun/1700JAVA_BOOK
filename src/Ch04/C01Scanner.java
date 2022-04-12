package Ch04;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		//System.in 	: 표준입력 스트림 요청(ex.키보드)
		//System.out 	: 표준출력 스트림 요청(ex.모니터)
		//new Scanner(System.in) : 표준 입력 스트림과 연결될 객체 생성
		//Scanner sc 	: 스캐너 장치의 위치정보를 저장할 용도의 참조변수
		
		Scanner sc = new Scanner(System.in);
		
		//new Scanner(System.in)
		//->키보드와 연결될 스캐너객체 생성
		
		//Scanner sc 
		//->생성된 스캐너객체를 컨트롤할 참조변수
		
		
		//Scanner sc = new Scanner(System.in)
		//->키보드와 연결되는 스캐너객체 만들어 sc참조변수에 연결시킨다
		
		System.out.print("정수 3개 입력 : " );
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		System.out.println("Sum : " + sum);
		
		sc.close();

	}

}

