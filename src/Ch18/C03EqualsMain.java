package Ch18;

class C03Simple{
	int num;
	C03Simple(int num){this.num=num;}
	
	@Override
	public boolean equals(Object obj) //Object obj=ob2 업캐스팅
	{
		if(obj instanceof C03Simple) 
		{
			
			C03Simple down = (C03Simple)obj;
			return this.num == down.num;
		}
			
		return false;
		
		
	}
}
public class C03EqualsMain {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(10);
		C03Simple ob2 = new C03Simple(11);
		System.out.println("ob1 = " + ob1);
		System.out.println("ob2 = " + ob2);
		System.out.println("ob1.equals(ob2) : "+ob1.equals(ob2));
		
		
	}

}
