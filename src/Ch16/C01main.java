package Ch16;

interface Remocon{
	int MAXVOL=10;		//static final int MAXVOL
	int MINVOL=0;		//static final int MINVOL
	void On();			//추상매서드
	void Off();
	void setVolum(int vol);
}
interface Searchable extends Remocon{
	
	void Search(String url);
}

class TV implements Remocon{
	int vol;
	@Override
	public void On() {
		System.out.println("TV를 켭니다");
	}
	@Override
	public void Off() {
		System.out.println("TV를 끕니다");
	}
	@Override
	public void setVolum(int vol) {
		//10을초과==>MAXVOL
		//0미만 ==>MINVOL
		if(vol>=MAXVOL)
			this.vol=MAXVOL;
		else if(vol<=MINVOL)
			this.vol=MINVOL;
		else
			this.vol=vol;
		
	}
}
class SmartTV extends TV implements Searchable{

	@Override
	public void Search(String url) {
		System.out.println(url+"을 검색합니다");
		
	}
	
}

class Radio  implements Remocon{
	int vol;
	@Override
	public void On() {	
		System.out.println("Radio를 켭니다");
	}
	@Override
	public void Off() {	
		System.out.println("Radio를 끕니다");
	}
	@Override
	public void setVolum(int vol) {
		//10을초과==>MAXVOL
		//0미만 ==>MINVOL
		if(vol>=MAXVOL)
			this.vol=MAXVOL;
		else if(vol<=MINVOL)
			this.vol=MINVOL;
		else
			this.vol=vol;	
	}
}
public class C01main {
	public static void main(String[] args) {
	
		Remocon controller=null;
		
		controller=new TV();	//Upcasting
		controller.On();
		controller.Off();
		
		controller=new Radio();
		controller.On();
		controller.Off();
		
		controller=new SmartTV();
		controller.On();
		controller.Off();
		
		Searchable down = (Searchable)controller;
		down.Search("www.naver.com");
		
		
		
	}

}
