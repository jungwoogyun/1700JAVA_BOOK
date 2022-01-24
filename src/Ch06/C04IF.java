package Ch06;

import java.util.Scanner;

public class C04IF {

	public static void main(String[] args) {
		//짝수이면서 3의배수이면 출력(ex.12,,)
		//홀수이면서 5의배수이면 출력(ex.15)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : " );
		int num = sc.nextInt();
		
		if(num%2==0)	//짝수냐?
		{
			//짝수인경우
			if(num%3==0)//3의 배수냐?
			{
				System.out.println("짝수 & 3의 배수");
			}
			else
			{
				System.out.println("짝수");
			}
		}
		else
		{
			//홀수인경우
			if(num%5==0)	//5의배수냐? 
			{
				System.out.println("홀수 & 5의배수");
			}
			else
			{
				System.out.println("홀수");
			}
		}
		
		
	}

}
