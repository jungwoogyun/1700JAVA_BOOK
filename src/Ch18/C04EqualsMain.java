package Ch18;

class Person{
	String name;
	int age;
	String addr;
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			
			Person down =(Person)obj;
			return  this.name.equals(down.name)
				 && this.age==down.age
				 && this.addr.equals(down.addr);
		}
		return false;
	}
	
	
	
}

public class C04EqualsMain {

	public static void main(String[] args) {		
		Person a = new Person("홍길동",40,"대구");
		Person b = new Person("홍길동",40,"대구");
		System.out.println("a==b ? " + a.equals(b));
		
	}

}
