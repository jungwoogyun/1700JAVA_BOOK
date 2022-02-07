package Ch10;

public class C01StringClassMain {

	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = "JAVA";
		
		
		
		System.out.println();
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		String str3 = new String("JAVA");
		String str4 = new String("JAVA");
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		System.out.println("str1==str2 ? " + (str1==str2));
		System.out.println("str1==str3 ? " + (str1==str3));
		System.out.println("str1==str4 ? " + (str1==str4));
		System.out.println();
		System.out.println("str2==str1 ? " + (str2==str1));
		System.out.println("str2==str3 ? " + (str2==str3));
		System.out.println("str2==str4 ? " + (str2==str4));
		System.out.println("---------------------------");
		System.out.println("str1==str2 ? " + (str1.equals(str2)));
		System.out.println("str1==str3 ? " + (str1.equals(str3)));
		System.out.println("str1==str4 ? " + (str1.equals(str4)));
		System.out.println();
		System.out.println("str2==str1 ? " + (str2.equals(str1)));
		System.out.println("str2==str3 ? " + (str2.equals(str3)));
		System.out.println("str2==str4 ? " + (str2.equals(str4)));
	}

}
