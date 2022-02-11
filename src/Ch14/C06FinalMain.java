package Ch14;


class C06Simple{
	final int x=10;
	int y;
}

public class C06FinalMain {

	public static void main(String[] args) {
		
		C06Simple obj = new C06Simple();
		
//		obj.x=10;
//		obj.y=20;
		
		final int num=10;
//		num=20;
		
		System.out.println("MAX : " + Define.MAX);
		System.out.println("MIN : " + Define.MIN);
		System.out.println("PI : " + Define.PI);

	}

}
