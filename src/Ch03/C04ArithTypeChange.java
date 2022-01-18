package Ch03;

public class C04ArithTypeChange {

	public static void main(String[] args) {
		int num = 10;
		int div = 4;
		
		double result1 = num/div;
		double result2 = (double)num/div;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}

}
