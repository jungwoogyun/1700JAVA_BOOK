package Ch15;



abstract class Remocon{
	abstract void PowerON();
	abstract void PowerOFF();
}

class TV extends Remocon{
	   private int size;	//TV사이즈(인치)
	   public TV(int size)	//생성자 
	   { 
		   this.size = size; 
	   }
	   int getSize() { 
		   return size; 	
	   }
	@Override
	void PowerON() {
		System.out.println("TV를 켭니다");	
	}
	@Override
	void PowerOFF() {
		System.out.println("TV를 끕니다");		
	}
}
class ColorTV extends TV{
	int color;
	ColorTV(int size,int color){
		super(size); //인자 1받는 생성자 호출
		this.color=color;
	}
	void printProperty() {
		System.out.printf("%d인치 %d컬러\n",  getSize(),color);
	}
}
public class C01PracMain {

	public static void main(String[] args) {
		//1) TV를 상속받은 ColorTV 클래스를 작성해서 main함수의 코드가 실행될수 있도록 설정!
		  ColorTV myTV = new ColorTV(32, 1024);
		  myTV.printProperty();
		  //-> '32인치 1024컬러' 가 출력
		  
		  TV myTV2 = new TV(52);
		  
		  Remocon controller =myTV;	//업캐스팅
		  controller.PowerON();		//재정의한 PowerON() 사용 가능
		  controller.PowerOFF();

		  controller =myTV2;		//업캐스팅
		  controller.PowerON();		//재정의한 PowerON() 사용 가능
		  controller.PowerOFF();
	}

}
