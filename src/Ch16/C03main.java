package Ch16;

import java.util.Scanner;

interface Stack {
	   int length(); 				// 현재 스택에 저장된 개수 리턴
	   int capacity(); 				// 스택의 전체 저장 가능한 개수 리턴
	   String pop(); 				// 스택의 톱(top)에 실수 저장
	   void push(String val); 	// 스택의 톱(top)에 저장된 실수 리턴
	}
class StringStack implements Stack{
	private int num;			//저장가능한 개수(문자열)
	private int set;			//저장 인덱스
	public String[] stack;		//문자열배열객체 연결용 참조변수
	
	StringStack(int num)
	{
		this.num = num;
		this.set=-1;				//처음 값을넣을 Idx위치 지정
		stack = new String[num];
	}
	
	public int length() {
		return set+1;	//현재 저장된 문자열
	}
	@Override
	public int capacity() {
		return (num-(set+1));
	}
	@Override
	public String pop()	//문자열빼기(set의값을 1감소) 
	{
		if(set<0)
		{
			System.out.println("UnderFlow~");
			return null;
		}
		else {
			String rm = stack[set];//삭제할 문자열
			set--;			//Top idx 1감소
			return rm;		//삭제된 문자열 리턴
		}
		
	}
	@Override
	public void push(String val) 
	{
		if(set+1==num)
		{
			System.out.println("OverFlow!!");
		}
		else {
			set++;
			stack[set]=val;
		}
		
	}
}

public class C03main {
	public static void main(String[] args) {
		StringStack stack = new StringStack(5);
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("--------M E N U---------");
			System.out.println("1 PUSH ");
			System.out.println("2 POP ");
			System.out.println("3 저장된 문자열 출력");
			System.out.println("4 남은공간 ");
			System.out.println("--------M E N U---------");
			System.out.print("NO 입력 : " );
			int no=sc.nextInt();
			if(no==1){
				System.out.print("문자열입력 : ");
				String tmp=sc.next();
				stack.push(tmp);
			}else if(no==2){
				stack.pop();
				
			}else if(no==3) {
				for(int i=0;i<=stack.length()-1;i++) {
					System.out.println(stack.stack[i]);
				}
			}else if(no==4) {
				
				int cap=stack.capacity();
				System.out.println("남은공간 : "+cap);
				
			}else{
				
			}
				
				
		}
		
		
		
	}
}
