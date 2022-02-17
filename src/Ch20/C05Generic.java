package Ch20;


interface Meterial{
	void showbean();
}
class Bean1 implements Meterial{

	@Override
	public void showbean() {
		System.out.println("Bean1재료로 한 커피");
	}
	//showbean()을 완성 - "Bean1재료로 한 커피"
}
class Bean2 implements Meterial{
	@Override
	public void showbean() {
		System.out.println("Bean2재료로 한 커피");	
	}
	//showbean()을 완성 - "Bean2재료로 한 커피"
}
class Bean3 implements Meterial{
	@Override
	public void showbean() {
		System.out.println("Bean3재료로 한 커피");	
	}
	//showbean()을 완성 - "Bean3재료로 한 커피"
}
class CoffeeMachine<T extends Meterial>	//extends를 이용해서 Bean1,2,3만 재료로 허용
{
	private T coffee;
	//Getter and Setter매서드 추가

	public T getCoffee() {
		return coffee;
	}

	public void setCoffee(T coffee) {
		this.coffee = coffee;
	}
}
public class C05Generic {
	public static void main(String[] args) {
		CoffeeMachine<Bean1> machine1 = new CoffeeMachine();
		machine1.setCoffee(new Bean1());
		machine1.getCoffee().showbean();
		
		CoffeeMachine<Bean2> machine2 = new CoffeeMachine();
		machine2.setCoffee(new Bean2());
		machine2.getCoffee().showbean();
		
		

	}

}
