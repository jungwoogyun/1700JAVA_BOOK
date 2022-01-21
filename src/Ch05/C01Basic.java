package Ch05;

import java.util.Scanner;

public class C01Basic {

	public static void main(String[] args) {
		//01 산술연산자(+,-,*,/,%)
//		int a=10,b=3;
//		System.out.println("a+b = " + (a+b));
//		System.out.println("a-b = " + (a-b));
//		System.out.println("a*b = " + (a*b));
//		System.out.println("a/b = " + (a/b));	//몫
//		System.out.println("a%b = " + (a%b));	//나머지(중요)
		
		//%
		//1 짝수 홀수
		//2 배수 구분
		//3 범위 지정
		//4 자리수 추출
		
		//02 복합대입연산자(산술연산자 + 대입연산자)
//		int a=0;	//초기값 0
//		int b=0;	//초기값 0
//		
//		a=5;		// = 대입연산자
//		a=7;		// 기존값(5)이  7로 덮어쓰기
//		a=a+3;		// a안의값(7)에 3을 더해 다시 a공간에 대입
//		a+=3;		// a=a+3 
//		a-=3;		// a=a-3
//		a*=3;		// a=a*3
//		a/=3;		// a=a/3
		
		//03 비교연산자(==,!=,> ,>=,<,<=)
		
//		int n1=10;
//		int n2=20;
//		System.out.println("n1==n2 : "+(n1==n2));
//		System.out.println("n1!=n2 : "+(n1!=n2));
//		System.out.println("n1>n2 : "+(n1>n2));
//		System.out.println("n1>=n2 : "+(n1>=n2));
//		System.out.println("n1<n2 : "+(n1<n2));
//		System.out.println("n1<=n2 : "+(n1<=n2));
		//== : 동등비교연산자
		//=  : 대입연산자
		//int a=10; int b=20;
		//a==b -> false
		//a=b  -> 20
		
		
		//04논리 연산자
		int n1=10;
		int n2=20;
		int n3=40;
		int n4=30;
		
		//and연산(&&)두 조건식 모두 참이면 참을 반환
//		System.out.println((n1==n2)&&(n3==n4));
//		System.out.println((n1!=n2)&&(n3!=n4));
//		System.out.println((n4>=n1)&&(n3>=n4));
//		System.out.println((n1<=n2)&&(n2>=n1));
		
		//or연산(||) 두 조건식 중 하나라도 참이면 참을 반환
		
//		System.out.println((n1==n2)||(n3==n4));
//		System.out.println((n1!=n2)||(n3!=n4));
//		System.out.println((n4>=n1)||(n3>=n4));
//		System.out.println((n1<=n2)||(n2>=n1));	
		
		
		//05증감 연산자
		//변수안의 값을 1증가(++)하거나 1감소(--)하기 위해서 사용되는 연산자
		//전치연산자(++a, --a) : 값을 먼저 1증가(or 1감소)시킨 이후에 다른 연산처리 
		//후치연산자(a++ , a--): 다른 연산 처리를 먼저 한 뒤 1증가(or 1감소)
		
//		int a=10;
//		int b=20;
//		int c = ++a;
//		int d = b++;
//		int e = a-- + b--;
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
//		System.out.println("e = " + e);
		
		
		//삼항연산자(->if/switch로 대체)
		
//		int score=70;
//		char grade = (score>90)?'A':(score>80)?'B':'C' ;
//		System.out.println("점수 : " + grade);
		
		//문제
		//국어/영어/수학점수를 입력받아 세수의 합이 240점이상이면 '합격'출력
		//아니면 '불합격'을 출력하세요(삼항연산자를 사용)
		
		int kor,eng,mat;
		int sum=0;
		String result;	//결과
		Scanner sc = new Scanner(System.in);
		System.out.print("국영수 입력 : ");
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		sum = kor+eng+mat;
		result=(sum>=240)?"합격":"불합격";
		System.out.println("결과 : " + result);
		
		
		
		
		
		
		
		
		
		

	}

}
