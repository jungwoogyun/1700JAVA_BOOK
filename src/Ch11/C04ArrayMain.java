package Ch11;

import java.util.Scanner;

class Position{
	private int x;
	private int y;
	private int z;
	Position(int x,int y,int z){
		this.x =x;this.y=y;this.z=z;
	}
	void ShowXYZ(){
		System.out.printf("%d %d %d\n",x,y,z);
	}
}

public class C04ArrayMain {

	public static void main(String[] args) {
		//키보드로부터 몇개의 Position을 받을 건지 정수로 받아서
		//그길이만큼 Position 배열을 만들고
		//각 배열요소요소에 Position객체를 연결합니다
		//연결시 Position생성자에 들어갈 x,y,z는 임의의값을 넣어주면됩니다
		//마지막으로 반복문으로 각요소에있는 객체의 ShowXYZ()를 이용해서
		//x,y,z좌표를 확인합니다
		Scanner sc = new Scanner(System.in);
		System.out.print("개수 : ");
		int num = sc.nextInt();
		Position poslist[] = new Position[num];
		System.out.println();
		for(int i=0;i<poslist.length;i++) {
			poslist[i]=new Position((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)); 
		}
		
		for(int i=0;i<poslist.length;i++) {
			poslist[i].ShowXYZ();
		}
		
		sc.close();
		
		
	}

}
