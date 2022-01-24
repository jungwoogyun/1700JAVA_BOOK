package Ch06;

import java.util.Scanner;

public class C02IF {

	public static void main(String[] args) {
		//else if 여러 조건식들을 하나의 if코드블럭에 적용
		
		//국어점수 : 40점이상 
		//영어점수 : 40점이상
		//수학점수 : 40점이상
		//전체 평균이 60점이상이면 합격
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국 영 수 입력 : ");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int mat=sc.nextInt();
		int avg=(kor+eng+mat)/3;
		
		if(kor<40)
		{
			System.out.println("불합격..");
		}
		else if(eng<40) //kor점수는 40점이상인경우..
		{
			System.out.println("불합격..");
		}
		else if(mat<40)//kor>=40&&eng>=40인경우..
		{
			System.out.println("불합격..");
		}
		else if(avg<60) // kor>=40&&eng>=40&&mat>=40
		{
			System.out.println("불합격..");
		}
		else // kor>=40&&eng>=40&&mat>=40&&avg>=60 
		{
			System.out.println("합격..");
		}

	}

}
