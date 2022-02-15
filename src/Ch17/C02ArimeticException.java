package Ch17;

import java.util.Scanner;

public class C02ArimeticException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int data=100;
		while(true) 
		{
			try {
			System.out.print("나눌수 입력 : ");
			int div=sc.nextInt();
			System.out.println("결과값 : " + (data/div)); // N/0 
			}catch(ArithmeticException e) {
				System.out.println("예외발생! : " + e.getCause());
			}
			
		}

		
	}

}
