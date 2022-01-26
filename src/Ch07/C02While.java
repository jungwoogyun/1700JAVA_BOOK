package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		
		//중첩while 기본 
		//전체 구구단 출력
		//2단 ~ 9단
		
//		dan		i
//		2		1-9
//		3		1-9
//		4		1-9
//		5		1-9
//		...
//		9		1-9
//		--------------
//		dan=2		i=1
//		dan<=9		i<=9
//		dan++		i++
		
		
//		int dan=2;
//		int i=1;
//		
//		while(dan<=9)
//		{
//			
//			i=1;	//초기값
//			while(i<=9)	//조건식
//			{
//				System.out.println(dan+" x " +i+" = "+(dan*i));
//				i++;	//탈출연산
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		//전체 구구단 역순출력
		//9 x 1 = 9
		//9 x 2 = 18
		//9 x 9 = 81
		//
		//8 x 1 = 8
		//..
		//2 x 1 = 2
		
//		dan		i
//		9		1-9
//		8		1-9
//		7		1-9
//		..
//		2		1-9
//		-----------------------
//		dan=9		i=1
//		dan>=2		i<=9
//		dan--;		i++
		
//		int dan=9;
//		int i=1;	
//		
//		while(dan>=2) {
//			
//			i=1;
//			while(i<=9) {
//				System.out.println(dan+" x "+ i +" = "+(dan*i));
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		

		
		//전체 구구단 역순출력
		//9 x 9 = 81
		//9 x 8 = 72
		//9 x 7 = 63
		//9 x 1 = 9
		//
		//8 x 9 = 72
		
		
//		int dan=9;
//		int i=1;	
//		
//		while(dan>=2) {
//			
//			i=9;
//			while(i>=1) {
//				System.out.println(dan+" x "+ i +" = "+(dan*i));
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		
		//단수 입력받아 단수부터 9단까지 출력
		//단수 : 5단
		//5 x 1 = 5
		//5 x 2 = 10
		//~
		//9 x 1 = 9
		
		
//		*****
//		*****
//		*****
//		*****


//
//i	j
//0	0-4
//1	0-4	
//2	0-4
//3	0-4
//--------------------
//i=0	j=0
//i<4	j<5
//i++	j++
//
//		int i=0;	//행증가
//		int j=0;	//별찍기
//		while(i<4) {
//			
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
//		*
//		**
//		***
//		****

//		i	j
//		0	0-0
//		1	0-1
//		2	0-2
//		3	0-3
//		-------------
//		i<4	j=0
//		i++	j<=i
//			j++
		
		
//		int i=0; //줄바꿈
//		int j=0; //별찍기
//		
//		while(i<4) {
//			
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		문제
//		****
//		***
//		**
//		*

		
//		i	j
//		0	0-3	
//		1	0-2
//		2	0-1
//		3	0-0
//		------------
//			j=0
//			j<=3-i
//			j++;

//		int i=0;
//		int j=0;
//		while(i<4) {
//			j=0;
//			while(j<=3-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
//		   *
//		  ***
//		 *****
//		*******
		
//		i	j(공백)		k(별)
//		0	0-2		0-0
//		1	0-1		0-2
//		2	0-0		0-4
//		3	x		0-6
//		------------------------------
//		j=0			k=0
//		j<=2-i		k<=2*i
//		j++			k++
		
//		int i=0;	//행증가
//		int j=0;	//공백
//		int k=0;	//별
//		
//		while(i<4) {
//			
//			//공백
//			j=0;
//			while(j<=2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		
			
			
		
	
//		*******
//		 *****
//		  ***
//		   *
// 
//		i	j(공백)		k(별)
//		0	x		0-6	
//		1	0-0		0-4
//		2	0-1		0-2
//		3	0-2		0-0
//		----------------------------
//			j=0		k=0
//			j<=i-1	k<=6-2*i
//			j++		k++
//			

			
//		int i=0; //행증가
//		int j=0; //공백
//		int k=0; //별찍기
//		
//		while(i<4) {	
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=6-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		

		//입력한 높이만큼 삼각형 출력해보기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : " );
//		int h=sc.nextInt();
//		
//		int i=0;	//행증가
//		int j=0;	//별찍기
//		
//		while(i<h) {
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 : " );
		int h=sc.nextInt();
		
		int i=0;	//행증가
		int j=0;	//공백
		int k=0;	//별찍기
		
		while(i<=h-1)
		{
			//공백
			j=0;
			while(j<=(h-2)-i) {
				System.out.print(" ");
				j++;
			}
			//별찍기
			k=0;
			while(k<=2*i) {
				System.out.print("*");
				k++;
			}
			
			
			System.out.println();
			i++;
		}
		
		
		
		
		
		
		
//		   *
//		  ***
//		 *****
//		*******
//		 *****
//		  ***
//		   *
		
		
		
		
		
		
		
	

	}

}
