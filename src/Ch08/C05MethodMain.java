package Ch08;

class Simple{
	void Func() {
		System.out.println("Func호출!");
	}
}
public class C05MethodMain {
	public static void main(String[] args) {
		Simple obj = new Simple();
		System.out.println("1 호출--------");
		obj.Func();
		System.out.println("2 호출--------");
		obj.Func();
		System.out.println("3 호출--------");
		obj.Func();
		System.out.println("종료----------");
	}

}
