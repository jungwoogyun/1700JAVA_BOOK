package Ch18;


class BOOK{
	String title;
	int bookcode;
	
	public BOOK(String title, int bookcode) {
		this.title = title;
		this.bookcode = bookcode;
	}

	@Override
	public String toString() {
		return "BOOK [title=" + title + ", bookcode=" + bookcode + "]";
	}

//	@Override
//	public String toString() {
//		return title+","+bookcode;
//	}
	
}
public class C02Main {

	public static void main(String[] args) {
		BOOK book1 = new BOOK("DOITJAVA",1010);
		System.out.println(book1.toString());
		System.out.println(book1);

	}

}
