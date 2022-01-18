package Ch03;

public class C01typeChange {

	public static void main(String[] args) {
		//자료형변환
		//특정 자료형에 의해 저장된 데이터가 다른 자료형 공간에 전달될때
		//자료형을 일치시키는 작업
		//자동형변환(암시적형변환) : 컴파일러에 의해 자동으로 자료형 일치
		//강제형변환(명시적형변환) : 프로그래머에 의해 강제적으로 자료형 일치
		
		
		//자동형변환
		//byte<char<int<long<float<double
		byte byteval = 10;
		
		int intval = byteval; //자동형변환
		
		char charval = '가';
		intval = charval;	// 자동형변환
		
		long longval = intval; //자동형변환
		
		
		float floatval = longval; //자동형변환
		
		double doubleval = floatval; //자동형변환
		

	}

}
