package Ch07;

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
		
		
		int dan=2;
		int i=1;
		
		while(dan<=9)
		{
			
			i=1;	//초기값
			while(i<=9)	//조건식
			{
				System.out.println(dan+" x " +i+" = "+(dan*i));
				i++;	//탈출연산
			}
			System.out.println();
			dan++;
		}
		
		
		//전체 구구단 역순출력
		//9 x 1 = 9
		//9 x 2 = 18
		//9 x 9 = 81
		//
		//8 x 1 = 8
		//..
		//2 x 1 = 2
		
		//전체 구구단 역순출력
		//9 x 9 = 81
		//9 x 8 = 72
		//9 x 7 = 63
		//9 x 1 = 9
		//
		//8 x 9 = 72
		
		//단수 입력받아 단수부터 9단까지 출력
		//단수 : 5단
		//5 x 1 = 5
		//5 x 2 = 10
		//~
		//9 x 1 = 9
		
		
		

	}

}
