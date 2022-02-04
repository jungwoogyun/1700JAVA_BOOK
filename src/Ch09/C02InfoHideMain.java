package Ch09;

class C02Person{
	//속성
	public String name;
	private int age;		//나이
	private String id;		//주민번호
	private String addr;	//주소
	
	
	public C02Person(String name, int age, String id, String addr) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}



public class C02InfoHideMain {
	public static void main(String[] args) {
		

	}

}
