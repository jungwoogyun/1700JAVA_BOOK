package Ch21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person{
	String name;
	String addr;
	//생성자(모든필드)
	public Person(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	//toString() : 모든필드 출력
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}
	//equals재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person down = (Person)obj;
			return this.name.equals(down.name)&&this.addr.equals(down.addr);	
		}
		return false;
	}
	
	//Hashcode 재정의 
	@Override
	public int hashCode() {
		//멤버의 name,addr각각의 저장된 문자열을 문자로 쪼갠다음 문자를 숫자로 바꾸고 더한후 저장
		int n1=0;
		int n2=0;
		//name을 숫자로 변환
		for(int i=0;i<name.length();i++) {
			char tmp=name.charAt(i);
			n1+=tmp;
		}
		for(int i=0;i<addr.length();i++) {
			char tmp=addr.charAt(i);
			n2+=tmp;
		}
		return n1+n2;
	}
	
	
	
}
public class C05Set {

	public static void main(String[] args) {
		Set<Person> set = new HashSet(); 
		
	
		//삽입
		set.add(new Person("홍길동","대구"));
		set.add(new Person("홍길동","대구"));
		set.add(new Person("강남구","서울"));
		
		//개수확인
		System.out.println("개수 : " + set.size());
		
		//값 확인
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext()) {
			Person tmp = iter.next();
			System.out.println(tmp.toString());
		}
		// 삭제??
		//set.remove(new Person("홍길동","대구"));
		System.out.println();
		
		// 삭제
		// 값 확인
		Iterator<Person> iter2 = set.iterator();
		Person tmp=null;
		while(iter2.hasNext()) {
				tmp = iter2.next();
				if(tmp.name.equals("홍길동")&& tmp.addr.equals("대구")) {
					break;
				}
		}
		set.remove(tmp);
		System.out.println("개수(삭제이후) : " + set.size());
		
		
		
		
	}

}
