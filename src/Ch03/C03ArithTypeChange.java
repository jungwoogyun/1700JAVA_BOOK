package Ch03;

public class C03ArithTypeChange {

	public static void main(String[] args) {
		//정수 연산시 형변환(int보다 작은 자료형들의 덧셈연산) ->int형으로 형변환
		byte x=10;
		char y=20;
		short z=30;
		
		int result1 = x+y+z; //컴파일 오류.. 덧셈연산시 모든 피연산자는 int형으로 형변환
		
		//정수 연산시 형변환(int보다 큰자료형이 포함된 덧셈연산) ->큰자료형으로 형변환
		long w=40;
		
		long result2 = x+y+z+w; //컴파일오류 ..int보다 큰자료형 연산식에 포함되면 큰자료형으로 형변환
		
		//실수 연산시 형변환(정수형,실수형 섞여있을때)->실수자료형으로 형변환
		
		float v=3.14f;
		double o=3.14;
		
		double result3 = x+y+z+w+v+o;
		
		
		

	}

}
