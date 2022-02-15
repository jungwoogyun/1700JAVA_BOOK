package Ch18;

class A{
	
}

public class C01Object {

	public static void main(String[] args) {

		Object ob1 = new Object();
		System.out.println(ob1.toString()); //클래스자료형@Hashcode
		
		System.out.println("-------------");
		A ob2 = new A();
		System.out.println("ToString() : " +ob2.toString());
		System.out.println("getClass() : " +ob2.getClass());
		System.out.println("getClass().getname() : " +ob2.getClass().getName());
		System.out.printf("hashcode() : %x\n" , ob2.hashCode());
		System.out.println("ob2 : " + ob2);
		System.out.println("-------------");
		
		String str="Hello World";
		System.out.println("str : " + str);
		System.out.println("str.toString() : " + str.toString());
		System.out.printf("hashCode() : %x\n ",str.hashCode());
		
	}

}
