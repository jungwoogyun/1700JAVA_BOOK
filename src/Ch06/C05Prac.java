package Ch06;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		
		//정수 하나 입력 받습니다
		
		
		
		//&&연산자는 쓰지 않습니다
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n%3==0)
		{

			if(n%5==0) {
				//3의 배수이면서 5의배수라면 출력
			}else {
				
				if(n%4==0) {
					//3의 배수이면서 5의배수는 아니면서 4의 배수라면 출력
				}
			}
		}
		else
		{
			if(n%4==0) {
				//3의 배수가 아니면서 4의 배수라면 출력
			}
		}
		
		

	}

}
