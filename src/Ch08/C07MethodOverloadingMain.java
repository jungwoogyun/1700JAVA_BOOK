package Ch08;

//매서드 오버로딩
//매서드의 이름은 그대로 두고 매개변수 타입이나,개수,반환자료형을 다양하게
//지정할 수 있도록 허용한 문법
//함수명의 통일을 위해 사용


import java.util.Scanner;

class C07Calc
{
	Scanner sc = new Scanner(System.in);
	int sum(int x,int y) {
		return x+y;
	}
	int sum(int x,int y,int z) {
		return x+y+z;
	}
	double sum(double x, double y) {
		return x+y;
	}
}
public class C07MethodOverloadingMain {
	public static void main(String[] args) {
		C07Calc cal = new C07Calc();
		System.out.println("sum(x,y) : " + cal.sum(10,20));
		System.out.println("sum(x,y) : " + cal.sum(10,20,30));
		System.out.println("sum(x,y) : " + cal.sum(10.1,20.2));
	}

}
