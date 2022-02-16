package Ch20;

class Simple<T>{
	public T x;
	public T y;
	Simple(T x, T y){
		this.x = x; this.y=y;
	}
	
	@Override
	public String toString() {
		return "Simple [x=" + x + ", y=" + y + "]";
	}
	
}
public class C01Generic {
	public static void main(String[] args) {
			Simple<Integer> ob1 = new Simple(10,20);
			System.out.println("ob1 : " + ob1.toString());
			Simple<Double> ob2 = new Simple(10.1,20.1);
			System.out.println("ob2 : " + ob2.toString());
			Simple<String> ob3 = new Simple("하나","둘");
			System.out.println("ob3 : " + ob3.toString());
	}

}
