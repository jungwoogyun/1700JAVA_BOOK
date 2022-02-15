package Ch17;

public class C01NullPointerException {

	public static void main(String[] args) {
		
		try {
		
			String str =null;	//Null참조변수
			str.toString();		//객체정보 표시 String 매서드
		
		}catch(NullPointerException e) {
			//System.out.println("예외발생!..처리구간");
			//System.out.println(e.getCause());
			//System.out.println(e.toString());
			//System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
		
		System.out.println("실행해야되는 코드1");
		System.out.println("실행해야되는 코드2");

	}

}
