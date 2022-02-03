package Ch08;

import java.util.Scanner;

class C06Calc
{
	Scanner sc = new Scanner(System.in);
	//반환값 o , 인자 o
	public int sum1(int x,int y) {
		return x+y;
	}
	//반환값 o , 인자 x
	public int sum2() {
		System.out.print("값입력(x y) : " );
		int x=sc.nextInt();
		int y=sc.nextInt();
		return x+y;
	}
	//반환값 x , 인자 O
	public void sum3(int x, int y) {
		System.out.println("sum3(x,y) : " + (x+y));
	}
	//반환값 x , 인자 x
	public void sum4() {
		System.out.print("값 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print("X + Y = " +(x+y));
	}
	
	public int sub1(int x , int y) {
		return x-y;
	}
	public int sub2() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x-y;
	}
	public void sub3(int x, int y) {
		System.out.println("x-y : " + (x-y));
	}
}

public class C06MethodMain {
	public static void main(String[] args) {
		C06Calc cal = new C06Calc();
		int result1 = cal.sum1(10, 20);
		System.out.println("sum1(10,20) : "+result1);
		int result2 = cal.sum2();
		System.out.println("sum2() : "+result2);
		cal.sum3(100,200);
		
		cal.sum4();
		System.out.println("--------------------");
		
		int r1=cal.sub1(100,200);	//x-y값 리턴
		int r2=cal.sub2();			//x,y값 받아서 x-y값 리턴
		cal.sub3(300,10);			//x-y값을 출력
		
		
	}

}
