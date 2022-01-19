package Ch03;

public class C05ArithTypeChange {

	public static void main(String[] args) {
		//----------------------
		//문자열 + 숫자
		//----------------------
//		System.out.println("문자열1" + "문자열2"); 		//단순 연결
//		System.out.println("문자열1"+','+"문자열2");	//단순 연결
//		System.out.println("문자열1"+2);//숫자->문자열자동형변환,연결
//		System.out.println(2+"문자열1");//숫자->문자열자동형변환,연결
//		System.out.println(2+1+"문자열1");
		
		//----------------------
		//문자열->숫자로 강제 형변환
		//----------------------
		
//		System.out.println("10" + "20"); //단순 연결
//
//		//문자열 -> 숫자형으로 변환(정수)
//		int n1=Integer.parseInt("10");	//문자열인10을 정수형으로 형변환
//		int n2=Integer.parseInt("20");	//문자열인20을 정수형으로 형변환
//		
//		System.out.println(n1 + n2); 	//30
//		
//		//문자열 -> 숫자형으로 변환(실수)
//		double n3=Double.parseDouble("3.14");
//		double n4=Double.parseDouble("4.15");
//		System.out.println(n3+n4);
		
		//----------------------
		//숫자->문자열로 강제 형변환
		//----------------------
		
		int n1=10;
		double n2=20.4;
		
		System.out.println(n1+n2);
		
		String str1=String.valueOf(n1);
		String str2=String.valueOf(n2);
		
		System.out.println(str1+str2);
		

	}

}
