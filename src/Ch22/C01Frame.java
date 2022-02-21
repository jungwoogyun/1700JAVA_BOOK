package Ch22;

import javax.swing.JFrame;

public class C01Frame {

	public static void main(String[] args) {

		JFrame frame = new JFrame("첫번째 창입니다");	//프레임창 생성
		//frame.setTitle("첫번째 창입니다");	//프레임창 제목 설정
		frame.setBounds(10,10,300,500);	//시작 위치(10,10),가로세로크기(300,500)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 프로세스종료처리
		frame.setVisible(true);		//화면표시여부 
		

	}

}
