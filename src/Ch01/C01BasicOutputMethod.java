package Ch01;

public class C01BasicOutputMethod {

	public static void main(String[] args) {
		
		//System.out : 표준 출력 스트림(표준출력장치(ex.모니터)방향으로 데이터 전달을 위한 통로를 만든다)
		//System.out.print() : 콘솔화면 출력메서드
		
		//ESCAPE 문자 사용하기
		//ESCAPE :탈출하다
		// \n : 개행(줄바꿈)
		// \t : tab공백
		
//		System.out.print("Hello World\n");
//		System.out.print("Hello World\n");
//		System.out.print("Hello\tWor\tld\n");
		
//		//문제
//		*
//		**
//		***
//		****
//		System.out.print("*\n");
//		System.out.print("**\n");
//		System.out.print("***\n");
//		System.out.print("****\n");
 	
//		//문제
//		이름		나이		전공
//		홍길동	33		컴퓨터공학
//		동길동	22		네트워크전공
//		남길동	44		정보보안
//		System.out.print("이름\t나이\t전공\n");
//		System.out.print("홍길동\t33\t컴퓨터공학\n");
		
		//System.out.printf()
		//f:format :형식,서식(서류를 꾸미는 일정한 양식)
		//%d : 10진 정수 서식문자
		//%f : 10진 실수 서식문자
		//%c : 한문자 서식문자
		//%s : 문자열 서식문자
		
//		System.out.printf("%d %d %d\n",10,20,30);
//		System.out.printf("%f %f %f\n",10.1,20.2,30.3);
//		System.out.printf("%c %c %c\n",'a','b','c');
//		System.out.printf("%s , %s , %s","This","is","String");
//		System.out.printf("%d.%s : %c\n", 1,"홍길동",'A');
		
		
		//문제
		//서식문자를 이용해서 다음과 같은 문장을 완성하세요
		//나의 이름은 %s 입니다		(%d에 본인 이름)
		//나의 나이는 %d 살입니다 	(%d에 본인 나이)
		
//		System.out.printf("나의 이름은 %s 입니다\n","홍길동");
//		System.out.printf("나의 나이는 %d 살입니다\n",33);
		
		//System.out.println() : 자동줄바꿈
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
	}

}
