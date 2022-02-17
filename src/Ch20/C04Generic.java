package Ch20;

class Water{
	public void doPriting() {
		System.out.println("Water 재료로 출력!");
	}
}

//Material 과 상속관계인 하위 클래스만 재료로 사용하기 위함
interface Material{
	void doPriting();
}

//ThreeDPrinter에 멤버로 사용될 재료 클래스 
class Powder implements Material{
	public void doPriting() {
		System.out.println("파우더 재료로 출력!");
	}
}
//ThreeDPrinter에 멤버로 사용될 재료 클래스 
class Plastic implements Material{
	public void doPriting() {
		System.out.println("플라스틱 재료로 출력!");
	}
}
//T extends Material : Material 과 상속관계의 클래스자료형만 허용된다!
class ThreeDPrinter<T extends Material>{
	private T material;

	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) 
	{
		this.material = material;
	}
	
}
public class C04Generic {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter();
		printer1.setMaterial(new Powder());
		printer1.getMaterial().doPriting();
	 
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter();
		printer2.setMaterial(new Plastic());
		printer2.getMaterial().doPriting();
		
		
		ThreeDPrinter<Water> printer3 = new ThreeDPrinter();
		printer3.setMaterial(new Water());
		printer3.getMaterial().doPriting();
		
		 
	}

}
