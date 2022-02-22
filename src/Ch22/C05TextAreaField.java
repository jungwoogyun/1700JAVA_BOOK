package Ch22;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C05Swing extends JFrame{

	public C05Swing(){
		//프레임 처리
		super("다섯번째 창입니다");
		setBounds(100,100,300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//패널처리
		JPanel panel = new JPanel();			//패널 객체 생성
		panel.setLayout(null);					//레이아웃 사용여부 x
		add(panel);								//프레임창에 추가
		
		
		//TextArea 추가
		JTextArea area = new JTextArea(10,30);
		area.setBounds(10,10,260,350);
		panel.add(area);
		
		
		JTextField txt = new JTextField();
		txt.setBounds(10,370,260,30);
		panel.add(txt);
			
		//Btn추가
		JButton btn1 = new JButton("입력");
		btn1.setBounds(10,410,70,30);
		panel.add(btn1);
		JButton btn2 = new JButton("저장");
		btn2.setBounds(90,410,70,30);
		panel.add(btn2);
		
		
		setVisible(true);
		
	}
}
public class C05TextAreaField {
	public static void main(String[] args) {
		new C05Swing();

	}

}
