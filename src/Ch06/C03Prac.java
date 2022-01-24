package Ch06;

import java.util.Scanner;

public class C03Prac {

	public static void main(String[] args) {
		
		//학점을 입력 받아서
		//90점이상이면 A 
		//80점이상이면 B
		//70점이상이면 C
		//60점이상이면 D
		//60점미만이면 F 를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(num>=90)
		{
			System.out.println("A");
		}
		else if(num>=80)
		{
			System.out.println("B");
		}
		else if(num>=70)
		{
			System.out.println("C");
		}
		else if(num>=60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		//나이를 입력 받습니다
		//20이상이면 성인입니다 출력
		//8살이상이면 취학아동 입니다
		//8살미만이면 미취학아동 입니다
		
		

	}

}
