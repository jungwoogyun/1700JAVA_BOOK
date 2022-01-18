package Ch02;

public class C05자료형 {

	public static void main(String[] args) {
		//----------------------
		//정수 자료형
		//----------------------
		//int (4byte정수)
		
//		int var1=0b1011;	//2진수
//		int var2=0206;		//8진수
//		int var3=365;		//10진수
//		int var4=0xB3;		//16진수
//		
//		System.out.println("var1 : " + var1);
//		System.out.println("var2 : " + var2);
//		System.out.println("var3 : " + var3);
//		System.out.println("var4 : " + var4);
		
		//byte(1byte)
//		byte var1 = -128;
//		byte var2 = -30;
//		byte var3 = 30;
//		byte var4 = 127;
		//byte var5 = 128; //불가능.. 왜??? byte의 정수 허용 범위를 초과
							//-128 ~ 127
		//byte var6 = -129;
		//int var7 = 2100000000;
		//int는 약 -21억 ~ +21억까지 저장 가능
		
		
		//long(8byte)
//		long var1=10;
//		long var2=20L;	//L : 리터럴접미사(리터럴상수값뒤에 붙이는 기호,L,l:long, f,F:float)
//		long var3=10000000; //에러발생 왜?리터럴상수의 기본자료형 int 형(-21억 ~+21억)
//		long var4=10000000000L;
//		
	
		//----------------------
		//실수 자료형
		//----------------------
		//float : 4byte 실수 저장(소수점이하 6-9자리까지)
		//double: 8byte 실수 저장(소수점이하 16-18자리까지)
		
		//정밀도 테스트
//		float var1 = 0.11111111111111111111F; //F,f접미사 : 리터럴값을 float형으로 저장
//		double var2 = 0.11111111111111111111; //리터럴실수값은 실수기본료형 double 저장
//		
//		System.out.println("var1 : " + var1);
//		System.out.println("var2 : " + var2);
//		
//		//지수형
//		double var3 = 3e6; //3* 10^6,저장자료형은 double
//		double var4 = 3e6F;//3*10^6 ,저장자료형은 float
//		double var5 = 2e-3;//2*10-3 ,저장자료형은 double;
//		System.out.println("var3 : " + var3);
//		System.out.println("var4 : " + var4);		
//		System.out.println("var5 : " + var5);		
//		
		
		//----------------------
		//단일 문자
		//----------------------
		//char 자료형 : 2byte 정수 저장
		
//		char ch1='A';
//		char ch2='가';
//		//문자형 출력 
//		System.out.println(ch1);
//		System.out.println(ch2);
//		//강제형변환(정수로)
//		System.out.println((int)ch1);
//		System.out.println((int)ch2);
//		//강제형변환(char)
//		System.out.println((char)4444);
//		System.out.println((char)3000);
		
		//----------------------
		//문자열
		//----------------------		
//		//String : 클래스자료형을 문자열저장
//		
//		String name = "홍길동";	//클래스자료형으로 변수를 만들게 되면
//								//실제 데이터값이 저장되는 것이아니라
//								//실제 데이터값이 있는 위치정보(참조값,주소값)가 저장
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
		
//		String var = "나의직업은 \"개발자\" 입니다.";
		
		//----------------------
		//boolean
		//----------------------
		//boolean :true/false 저장 ,1byte size
		
//		boolean flag = true; //false;
//		flag=false;

		 
// TEST
	}

}




