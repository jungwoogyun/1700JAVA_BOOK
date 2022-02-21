package Ch21;

import java.util.*;

public class C07Map {

	public static void main(String[] args) {
		
		//MAP 객체생성
		Map<String,Integer> map = new HashMap();
		
		//저장
		map.put("aaa", 1234); // Key,value
		map.put("bbb", 5678);
		map.put("ccc", 9876);
		map.put("ddd", 1122);
		map.put("aaa", 7788); //Key중복허용x 마지막에 추가된값으로 변경
		
		//개수 확인
		System.out.println("개수 : " + map.size());
		
		//내용 출력
		//1)Map에 저장된 모든 Key를 가져오기
		Set<String> set=map.keySet();
		//2)set에서 사용할 iterator 지정
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key=iter.next(); //Set을 순회하면서 key를 저장
			int value = map.get(key);
			System.out.println("key : " + key+" val : " + value);
		}
		
		int rmval = map.remove("aaa");
		System.out.println("삭제확인 : " + rmval);
		System.out.println("삭제이후개수 :" + map.size());
		
		
		
		
		

	}

}
