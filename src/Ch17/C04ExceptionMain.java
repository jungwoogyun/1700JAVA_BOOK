package Ch17;

import java.util.Scanner;

public class C04ExceptionMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int data=100;
		String str=null;	//NULL예외발생용
		while(true) {
			
			try {
				System.out.print("나눌수 입력 : ");
				int div=sc.nextInt();
				System.out.println("결과값 : " + (data/div)); // 산술예외발생시점
				str.toString();		//NULL예외발생시점
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
//			catch(NullPointerException e) {
//				System.out.println("NULL예외발생!");
//			}catch(ArithmeticException e) {
//				System.out.println("산술예외발생!");
//			}
			
		}

	}

}
