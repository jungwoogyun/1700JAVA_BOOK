package Ch19;

import java.util.Date;

public class C01WrapperMain {

	public static void main(String[] args) {
		//Boxing
		Integer ob1=new Integer(100);
		Integer ob2 = new Integer("100");
		System.out.println(ob1+ob2);
		Integer ob3 = Integer.valueOf("300");
		System.out.println(ob1+ob2+ob3);
		
		//UnBoxing
		int val1 = ob1.intValue();
		int val2 = ob2.intValue();
		
		//자동 Boxing
		
		Integer ob11 = 100; //자동
		int val3 = 200;
		System.out.println(ob11+val3);
		
		//자동 UnBoxing
		int result = ob11+val3;
		
		System.out.println("현재시간 : " + new Date());

	}

}
