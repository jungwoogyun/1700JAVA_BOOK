package Ch20;


class Corn1{
	private Object obj;

	public Object get() {
		return obj;
	}
	public void set(Object obj)	//업캐스팅 필요! 
	{
		this.obj = obj;
	}
}

class Corn2<T>{
	private T obj;

	public T get() {
		return obj;
	}
	public void set(T obj) {
		this.obj = obj;
	}
	
}
public class C02UpdownCastingVsGeneric {
	public static void main(String[] args) {
		
		Corn1 corn1 = new Corn1();
		corn1.set("문자열콘!");
		String tmp =(String)corn1.get();	//다운캐스팅 필요!
		System.out.println(tmp);

		Corn2<String> corn2 = new Corn2();
		corn2.set("String콘");
		tmp = corn2.get();
		
		Corn2<Integer> corn3=new Corn2();
		corn3.set(1234);
		int result = corn3.get();
		
		

	}

}
