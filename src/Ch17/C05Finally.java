package Ch17;

public class C05Finally {

	public static void main(String[] args) {
		try {
			
			String str =null;	//Null참조변수
			str.toString();		//객체정보 표시 String 매서드
		
		}catch(NullPointerException e) {
			System.out.println("예외처리!!");
		}finally {
			System.out.println("무조건 실행!");
		}
		
		System.out.println("실행해야되는 코드1");
		System.out.println("실행해야되는 코드2");

	}

}
