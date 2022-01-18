package Ch02;

public class C01양의정수 {

	public static void main(String[] args) {
		//	1	1	1	1	1	1	1	1
		//	128	64 	32	16	8	4	2	1
		
		//2진수 		-> 10진수
		//00100010 	-> 2+32		
		//00011010	-> 2+8+16
		//01110101	-> 1+4+16+32+64
		
		//10진수 	-> 2진수
		//45		-> 00101101
		//128		-> 10000000
		//193		-> 11000001
		
		System.out.printf("10진수 : %d\n", 173);		//10 진수	
		System.out.printf("10진수 : %d\n", 0255);	// 0 접두사	: 8진수를 의미
		System.out.printf("10진수 : %d\n", 0xAD);		// 0x접두사 	: 16진수를 의미
		
		System.out.printf("8진수 : %o\n", 173);			//10 진수	
		System.out.printf("8진수 : %o\n", 0255);			// 0 접두사	: 8진수를 의미
		System.out.printf("8진수 : %o\n", 0xAD);			// 0x접두사 	: 16진수를 의미
		
		System.out.printf("16진수 : %X\n", 173);			//10 진수	
		System.out.printf("16진수 : %X\n", 0255);		// 0 접두사	: 8진수를 의미
		System.out.printf("16진수 : %x\n", 0xAD);		// 0x접두사 	: 16진수를 의미
		
		System.out.printf("정수 : %d\n", 0b1111);		//0b 접두사 : 바이너리 전달
		
		
	
		
		
		
		
	}

}
