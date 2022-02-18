package Ch21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Position{
	int x;
	int y;
	//생성자(모든 필드)
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//toString()(모든필드)
	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}
	//hashcode재정의(x,y의합 리턴)
	@Override
	public int hashCode() {
		return x+y;
	}
	//equals재정의(x,y모두 일치)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Position) {
			Position down = (Position)obj;
			return this.x==down.x&& this.y==down.y;
		}
		return false;
	}

}
public class C06Set {
	public static void main(String[] args) {
		Set<Position> set = new HashSet();
		//삽입
		set.add(new Position(10,20));
		set.add(new Position(30,40));
		set.add(new Position(10,20));
		//개수 확인
		System.out.println("개수 : " + set.size()); //2 가 출력 되어야함
		//삭제 
		Iterator<Position> iter = set.iterator();
		Position rm=null;
		while(iter.hasNext()) {
			rm = iter.next();
			if(rm.x==10&&rm.y==20) {
				break;
			}
			//x,y값이 모두 일치하면 해당 Position객체를 rm에 담아서 while 나가서 삭제하는 작업을 하세요
		}
		set.remove(rm);
		//개수확인
		System.out.println("개수 : " + set.size()); //1 이 출력 되어야함
	}

}
