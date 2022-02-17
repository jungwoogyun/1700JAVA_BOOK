package Ch21;

import java.util.*;

public class C01ArrayList {

	public static void main(String[] args) {
		
		//컬렉션 생성
		List<String> list = new ArrayList();
		
		//추가
		list.add("JAVA");	//0
		list.add("JDBC");	//1
		list.add("Servlet/JSP");	//2
		list.add("SpringFW");	//3
		
		//삭제
		list.remove(1);
		//개수확인
		System.out.println("개수 : " + list.size());
		
		//데이터확인
		//System.out.println("get(0) : " + list.get(0));
		for(int i=0;i<list.size();i++) {
			System.out.printf("get(%d) : %s\n",i, list.get(i));
		}
		
		

	}

}
