package Ch05;

public class C03BitArith {

	public static void main(String[] args) {
		//비트연산
		//참 	: 0이아닌 모든 값, 대표값(1)
		//거짓 	: 0
		int num1=15;		//00000000 00000000 00000000 00001111
		int num2=20;		//00000000 00000000 00000000 00010100
		int num3=num1&num2; //00000000 00000000 00000000 00000100
		int num4=num1|num2; //00000000 00000000 00000000 00011111
		int num5=num1^num2; //00000000 00000000 00000000 00011011 
		int num6=~num1;		//11111111 11111111 11111111 11110000
		System.out.println("AND 비트연산 : "+num3);
		System.out.println("OR  비트연산 : "+num4);
		System.out.println("XOR 비트연산 : "+num5);
		System.out.println("NOT 비트연산 : "+num6);

	}

}
