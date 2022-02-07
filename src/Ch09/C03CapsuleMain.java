package Ch09;

//캡슐화
//특정한 목적달성을 위해 필요한 여러 과정을 하나로 묶는작업
//ex)
//자동차 엔진 동작과정
//흡입 -> 압축 -> 폭발 -> 배기 과정을 거치게 되는데 
//이러한 동작과정을 묶어 하나의 캡슐로 처리할수 있다

//캡슐화는 정보은닉을 수반한다
//엔진의 동작과정중 흡입/압축 과정이 외부에 노출되어 순서가 변경된다거나 한다면
//자동차 자체에 큰 문제를 야기할 수있다
//캡슐화의 일부분이나 전부는 정보은닉(private)되어 묶여진다

//잘못된 캡슐화는 프로그램 전체에 영향을 주기 때문에
//작업 공정을 정확히 이해한 상태에서 처리한다


class C03Engine{
	//흡입
	private void Induction() {System.out.println("흡입!");}
	//압축
	private void Compress() {System.out.println("압축!");}
	//폭발
	private void Power() {System.out.println("폭발!");}
	//배기
	private void Exhaust() {System.out.println("배기!");}
	public void EngineStart() {
		Induction();//1
		Compress();//2
		Power();//3
		Exhaust();//4
	}
}
class C03Car{
	private C03Engine engine=new C03Engine();
	
	public void Carstart() {
		System.out.println("자동차 전원을 켭니다!");
		engine.EngineStart();
	}
}
public class C03CapsuleMain {
	public static void main(String[] args) {
		C03Car hong = new C03Car();
		hong.Carstart();
	}

}
