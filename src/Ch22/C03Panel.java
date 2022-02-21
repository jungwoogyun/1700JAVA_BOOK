package Ch22;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Panel
//컴포넌트들을 그룹별로 묶어서 처리할때 사용

class C03Swing extends JFrame{

	public C03Swing(){
		//프레임 처리
		super("세번째 창입니다");
		setBounds(100,100,300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		//패널처리
		JPanel panel = new JPanel();			//패널 객체 생성
		//panel.setBackground(Color.decode("#5F4C0B"));	//패널 BG 지정
		add(panel);	//프레임창에 추가
	}
}
public class C03Panel {
	public static void main(String[] args) {
		new C03Swing();
	}

}
