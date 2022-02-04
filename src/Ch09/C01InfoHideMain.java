package Ch09;

//접근한정자 
//
//private	: 동일클래스 안에서만
//default	: 기본값 , 동일패키지 내에서만
//public	: 모든클래스에서 접근가능

//정보은닉
//객체생성과정에서 멤버중 외부에서 노출을 제한해야하는
//민감데이터나 기능의 사용 제한하는 작업
//private 한정자 사용

class C01Person{
	//속성
	public String name;
	private int age;		//나이
	private String id;		//주민번호
	private String addr;	//주소
	
	//1)초기값을 계속 고정으로 사용하고 싶을때 - > 생성자매서드
	C01Person(String name,int age,String id,String addr){
		this.name = name;
		this.age = age;
		this.id = id;
		this.addr = addr;
	}
	//기능
	//Getter and Setter매서드를 통한 부분적 접근
	int getAge() {
		return this.age;
	}
	void setAge(int age) {
		this.age=age;
	}
	//id에 대한 Getter Setter 만들기
	String getId() {
		return this.id;
	}
	void setId(String id) {
		this.id=id;
	}
	//addr에 대한 Getter Setter 만들기
	String getAddr() {
		return this.addr;
	}
	void setAddr(String addr) {
		this.addr=addr;
	}
}
public class C01InfoHideMain {

	public static void main(String[] args) {
		C01Person obj = new C01Person("홍길동",55,"860918-9876551","대구");
		
		obj.setAge(66);
		obj.setId("123456-123456");
		obj.setAddr("서울~~");
		System.out.println("나이 : " + obj.getAge());
		System.out.println("ID : " + obj.getId());
		System.out.println("주소 : " + obj.getAddr());
		

	}

}
