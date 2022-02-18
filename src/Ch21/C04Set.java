package Ch21;


import java.util.*;

public class C04Set {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		
		
		//추가
		set.add("JAVA");
		set.add("JSP/Servlet");
		set.add("MYSQLDB");
		set.add("SPRING");
		set.add("JAVA");	//나중에 들어온값 적용,기존값 삭제
		
		//개수 확인
		System.out.println("개수 : " + set.size());	
		
		//전체 조회
		Iterator<String>iter = set.iterator();	//기준점 받아오기
		while(iter.hasNext())	//.hasNext() 다음위치 객체 존재여부확인
		{
			String tmp = iter.next();	//다음위치로 이동
			System.out.println(tmp);
		}
		
		//객체 삭제
		set.remove("JAVA");
		System.out.println("------------------");
		Iterator<String>iter2 = set.iterator();	//기준점 받아오기
		while(iter2.hasNext())	//.hasNext() 다음위치 객체 존재여부확인
		{
			String tmp = iter2.next();	//다음위치로 이동
			System.out.println(tmp);
		}
		
		
	}

}
