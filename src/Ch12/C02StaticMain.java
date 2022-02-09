package Ch12;

//정우균이 00식당(죽전점) 예약한다

class Customer{
	String name;
	String phone;
	String resname;
	String time;
	
	public Customer(String name, String phone, String resname, String time) {
		super();
		this.name = name;
		this.phone = phone;
		this.resname = resname;
		this.time = time;
	}
}
class Restorant{
	String resname;			//레스토랑 이름
	Customer[] room;		//레스토랑 예약작업용 배열형 참조변수
	int roomrevcnt;			//현재지점 예약수
	static int totalrevcnt;	//모든지점 예약수
	
	//생성자
	Restorant(String name,int roomcnt){
		this.resname=name;
		room=new Customer[roomcnt];
	}
	//예약작업 함수
	public void setReserve(Customer customer) //Customer customer = 600;
	{
		for(int i=0;i<room.length;i++) {
			if(room[i]==null) 
			{
				room[i]=customer;
				System.out.println(customer.name +" 님 예약완료");
				roomrevcnt++; //지점예약건수 증가
				totalrevcnt++; //전체 예약건수 증가
				break;
			}
		}
	}
	void ShowInfo() {
		System.out.println("지점명 : " + resname);
		System.out.println("지점 예약 건수 : " + roomrevcnt);
		System.out.println("전체 예약 건수 : " + totalrevcnt);
	}
}

public class C02StaticMain {
	public static void main(String[] args) {
		//식당 객체 생성
		Restorant res1 = new Restorant("00식당-반월당점",10);
		Restorant res2 = new Restorant("00식당-죽전점",5);
		
		//고객 객체 생성
		Customer customer1 = new Customer("홍길동","010-111-1111","00식당-반월당점","0900");
		Customer customer2 = new Customer("남길동","010-222-1111","00식당-반월당점","1200");
		Customer customer3 = new Customer("서길동","010-333-1111","00식당-죽전점점","1800");
		Customer customer4 = new Customer("동길동","010-444-1111","00식당-죽전점","1500");
		
		//res1에 고객예약
		res1.setReserve(customer1);
		res1.setReserve(customer2);
		//res2에 고객예약
		res2.setReserve(customer3);
		res2.setReserve(customer4);
		
		res1.ShowInfo();
		System.out.println();
		res2.ShowInfo();
		

	}

}
