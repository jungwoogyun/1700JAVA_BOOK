package Ch10;

public class C02StringcClassMain {

	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = " Is ";
		String str3 = "PowerFul";
		
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
		System.out.println(str4.length());
		System.out.println(str4.charAt(3));
		System.out.println(str4.replace('A', 'a'));
		System.out.println(str4.contains("Awefwefw"));
		
		
	}
	

}
