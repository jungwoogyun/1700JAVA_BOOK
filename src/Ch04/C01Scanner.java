package Ch04;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		//스트림 : 데이터의 이동통로,단방향성
		//주변장치와 App간의 데이터 교환을 위해서 OS를 통해 생성되어지는 가상데이터 이동채널(통로)
		
		
		//System.out	: 출력스트림 형성(해석:System이 가지고있는 출력장치(out) )- ex.모니터
		//System.in 	: 입력스트림 형성(해석:System이 가지고있는 입력장치(in) - ex.키보드,마우스
		
		//Scanner 		: 클래스자료형(키보드로부터 값을 받기위한 장치 생성용 자료형)
		//sc			: 키보드 데이터 수신 장치 이름
		//new Scanner() : 장치를 생성코드
		//System.in		: 표준입력 스트림 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		int num1 = sc.nextInt();//키보드로부터 값을받을때까지 대기(sc.nextInt())한상태에서
								//값이 입력되고 엔터(or space bar)를 입력하는 순간 해당값이
								//Scanner장치에 전달 그리고 그값은 왼쪽 num1공간에 초기화
		int num2 = sc.nextInt();
		
		System.out.println("num1 + num2 = "+(num1+num2));
		
		//장치 제거
		sc.close();
	}

}
