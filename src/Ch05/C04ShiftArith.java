package Ch05;

public class C04ShiftArith {

	public static void main(String[] args) {
		
		int num1 = 15;		//00000000 00000000 00000000 00001111
		int num3=num1<<3;	//00000000 00000000 00000000 00111100
							//num1<<2=> num1 * 2^3
					
		
		int num2 = 20;		//00000000 00000000 00000000 00010100
		int num4=num2>>3;	//00000000 00000000 00000000 00000010
							//num2 * 2^-3
		
		System.out.println("Num3 : " + num3);
		System.out.println("Num4 : " + num4);
		
	}

}
