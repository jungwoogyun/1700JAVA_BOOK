package Ch18;

class Position{
	int x;
	int y;
	Position(int x, int y){
		this.x=x;
		this.y=y;
	}
	//equals함수를 재정의하세요 멤버의x,y와 비교대상의 x,y가 모두 일치하면  true
	//그렇지 않으면 false 를 리턴합니다!
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Position) {
			Position down=(Position)obj;
			return this.x==down.x&&this.y==down.y;
		}
		return false;
	}
	
	
}
public class C05EqualsMain {
	public static void main(String[] args) {
		Position pos1=new Position(10,20);
		Position pos2=new Position(10,20);
		Position pos3=new Position(11,22);
	
		System.out.println("pos1==pos2 ? " +pos1.equals(pos2));
		System.out.println("pos1==pos3 ? " +pos1.equals(pos3));
		System.out.println("pos2==pos3 ? " +pos2.equals(pos3));
	}

}
