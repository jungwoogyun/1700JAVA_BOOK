package Ch14;

class A{
	int a;
	A(){}	
	A(int a){this.a=a;}
}
class B extends A{
	int b;
	B(){}
	B(int a,int b){super(a); this.b=b;}
}
class C extends A{
	int c;
	C(){};
	C(int a,int c){super(a); this.c=c;}
}
class D extends B{
	int d;
	D(){}
	D(int a,int b, int d){super(a,b);this.d=d;}
}
class E extends D{}
class F extends C{}
class G extends E{}
public class C02UpdDownCastingMain {

	public static void main(String[] args) {
		Func(new B(10,20));
		System.out.println();
		Func(new C(100,200));
		System.out.println();
		Func(new D(1000,2000,3000));
	}
	
	public static void Func(A obj) //A obj=new B(), A obj = new C();
	{
		System.out.println("a : " +obj.a);//A클래스의 멤버에 접근 가능
		//연결된 하위객체의 확장된 부분에 접근 위한  선별
		if(obj instanceof D) {
			D down = (D)obj;	//downcasting
			System.out.println("b : " + down.b);//확장된 멤버에 저근
			System.out.println("d : " + down.d);//확장된 멤버에 저근
		}else if(obj instanceof B) {
			B down = (B)obj;	//downcasting
			System.out.println("b : " +down.b);//다운캐스팅을 통한 확장된 멤버에 접근
		}else if(obj instanceof C){
			C down = (C)obj;	//downcasting
			System.out.println("c : " +down.c);//확장된 멤버에 접근
		}
	}
	
}
