package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
	
		
		//01 while기본
		//탈출요소 추가
		//1)탈출용 변수
		//2)탈출조건식
		//3)조건식을 거짓으로 만들어주기위한 연산처리
//		int i=0;	//1)탈출용 변수
//		while(i<10) //2)조건식(거짓이되면 반복해제) 
//		{
//			System.out.println("Hello World");
//			i++; //3)조건식을 거짓으로 만들어주기위한 연산
//		}
		
		//02 1-10까지 합 구하기
//		int i=1;
//		int sum=0;
//		while(i<=10)
//		{
//			System.out.println(i);
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		//문제 
		//키보드로 정수하나 입력받아서 1부터 n까지의 합 구합니다

//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : " );
//		int num=sc.nextInt();
//		int i=1;
//		int sum=0;
//		while(i<=num)
//		{
//			sum+=i;	//sum=sum+i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지 합 : %d\n", num,sum);

		
		//문제
		//키보드로 정수두개(n,m)을 입력받아 n부터 m까지의 합 구합니다
		//단 처음입력할때 n<m 조건을 만족해야합니다

//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력(n,m) : "); //3 10 , 10 3
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		
//		//swap
//		if(n>m)
//		{
//			int tmp=n;		
//			n=m;
//			m=tmp;
//		}
//		
//		
//		int i=n;	//초기값
//		int sum=0;
//		while(i<=m)	//조건식
//		{
//			sum+=i;	//sum = sum+i;
//			i++;	//증감연산
//		}
//		System.out.printf("%d 부터 %d까지 합 : %d\n", n,m,sum);
		
		
		//구구단(단수를 입력받아 구구단 출력)
//		Scanner sc = new Scanner(System.in);
//		int dan=2;
//		int i=1;
//		while(i<=9)
//		{
//			System.out.println(dan+" x "+i+" = "+(dan*i));
//			i++;
//		}

		//구구단 역순출력(시작 : 9 끝 : 1 반복Interval : 1씩감소..)
		//단수받아서 구구단 역순출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단수입력 : " );
//		int dan=sc.nextInt();
//		
//		int i=9;
//		while(i>=1) {
//			System.out.println(dan + " x "+i+" = "+(dan*i));
//			i--;
//		}
		
		// 1부터 10까지 중에 짝수의 합 구하기
//		int i=0;
//		int sum=0;
//		while(i<=10)
//		{
//			if(i%2==0)  {
//				System.out.println("i : " + i);
//				sum=sum+i;
//			}else {
//				
//			}
//			i++;
//		}
		

		// 1부터 n까지의 수중에 3의 배수의 합만 구해서 출력
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=n)
		{
			if(i%3==0) {
				System.out.println("i : " + i);
				sum+=i;//sum=sum+i;
			}
			i++;
		}
		System.out.printf("1부터 %d까지 중 3의배수 합 : %d\n",n,sum);
		
			
		
		
		
		
		
		
		
		
		
		

	}

}
