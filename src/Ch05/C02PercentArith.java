package Ch05;

import java.util.Scanner;

public class C02PercentArith {

	public static void main(String[] args) {
		
		//홀수/짝수 구분(N%2==0)
		
//		System.out.println(3%2==0);	//1
//		System.out.println(4%2==0);	//0
//		System.out.println(5%2==0);	//1
//		System.out.println(6%2==0);	//0
//		System.out.println(7%2==0);	//1
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : " );
//		int num=sc.nextInt();
//		String result=(num%2==0)?"짝수":"홀수";
//		System.out.println("결과 : "+result);
		
			
		//배수 구분(N%3 :0~2)
//		System.out.println(3%3==0);//0	 
//		System.out.println(4%3);	 
//		System.out.println(5%3);	 
//		System.out.println(6%3);	 
//		System.out.println(7%3);	 
//		System.out.println(8%3);
//		System.out.println(9%3);
//		System.out.println(10%3);
//		System.out.println(11%3);
//		System.out.println(12%3);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : " );
//		int num=sc.nextInt();
//		String result=(num%3==0)?"3의배수":"3의배수가 아님";
//		System.out.println("결과 : "+result);
		
		
		//범위지정
		//N%2 : 0-1
		//N%3 : 0-2
		//N%4 : 0-3
		//N%10 : 0-9
		//n%100 : 0-99
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		while(true)
//		{
//			num=sc.nextInt();
//			System.out.println("결과:"+(num%3));
//		}
		
		//자리수 확인
		int num=1234;
		
		System.out.println(num%10);
		System.out.println(num%100);
		System.out.println(num%1000);
		
		System.out.println(num/1000);
		System.out.println(num/100);

				
				
	}

}
