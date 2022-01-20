package Ch04;

import java.util.Scanner;

public class C02Prac {

	public static void main(String[] args) {
		//문제1
		
		//국어,영어,수학점수를 각각 입력받아 세수의 합(총점)과 평균을 구해보세요
		//국어 : kor, 영어 : eng, 수학  :mat 라고 변수명 정합니다
		//총점변수명 : int sum
		//평균변수명 : double avg
		//스캐너장치 만들어서 sc.nextInt() 사용합니다
		//평균의 소숫점은 유지될수있도록 형변환합니다
		
		int kor=0,eng=0,mat=0;
		int sum=0;
		double avg=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("국영수 점수입력 : ");
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		sum=kor+eng+mat;
		avg=(double)sum/3;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
		
		
		
		
		
	
		

	}

}
