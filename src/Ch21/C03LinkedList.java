package Ch21;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class BOOK{
	int code;
	String title;
	//생성자 추가(모든 필드를 받습니다)
	public BOOK(int code, String title) {
		super();
		this.code = code;
		this.title = title;
	}
	//toString()추가
	@Override
	public String toString() {
		return "BOOK [code=" + code + ", title=" + title + "]";
	}
	
}
public class C03LinkedList {
	public static void main(String[] args) {
		List<BOOK> list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("-----------------MENU-------------------");
			System.out.println("1 BOOK 정보 삽입");
			System.out.println("2 BOOK 정보 확인");
			System.out.println("3 종료");
			System.out.println("-----------------MENU-------------------");
			System.out.print("메뉴번호 : " );
			int menu=sc.nextInt();
			if(menu==1) {
				System.out.print("개수 입력 : " );
				int no = sc.nextInt();
				//입력받기
				int code=0;
				String title=null;
				BOOK tmp=null;
				for(int i=0;i<no;i++) {
					System.out.printf("%d 번째 Code : " , i+1 );
					code=sc.nextInt();
					System.out.printf("%d 번째 Title : " , i+1 );
					title = sc.next();
					tmp = new BOOK(code,title);
					list.add(tmp);
					System.out.println();
				}
				
			}else if(menu==2) {
				//출력하기
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i).toString());		
				}
			}else if(menu==3) {
				
				
			}else {
				System.out.println("번호 잘못입력!");
			}
					
		}
		
		
		//키보드로 부터 몇개의 책정보를 넣을지 입력(N)받은 다음 
		//입력한 만큼(N)의 책정보(code,title)을 받아서 list에 저장합니다
		//총 저장된 책의 개수를 출력하고(size())
		//list에 저장된 각 index의 code와 title을 출력합니다
		//삭제할 책이름(title)을 받아서 해당 책이름(title)을 가지는 BOOK객체를 list에서 제거(remove(i))합니다
		//제거이후 출력!
		
		
		

	}

}
