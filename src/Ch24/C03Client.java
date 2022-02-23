package Ch24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1 리스너인터페이스 상속(implements ActionListener,KeyListener..)
//2 액션처리할 매서드를 받아온다
//3 컴포넌트들을 멤버변수로 변경
//4 리스너에 등록한 컴포넌트(button,textfield..)을 지정해서
//  등록시킨다(ex.btn2.addActionListener(this))\
//5 액션처리할 매서드를 완성시킨다


class Cgui extends JFrame implements ActionListener,KeyListener{

	JTextField txt;
	JButton btn1;
	JButton btn2;
	JTextArea area;
	JScrollPane scroll;
	public Cgui(){
		//프레임 처리
		super("Chat Client");
		setBounds(100,100,300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//패널처리
		JPanel panel = new JPanel();			//패널 객체 생성
		panel.setLayout(null);					//레이아웃 사용여부 x
		add(panel);								//프레임창에 추가
		
		
		//TextArea 추가
		area = new JTextArea(10,15);
		//area.setBounds(10,10,260,350);
		//panel.add(area);
		
		//스크롤추가
		scroll = new JScrollPane(area);
		scroll.setBounds(10,10,260,350);
		panel.add(scroll);
		
		txt = new JTextField();
		txt.setBounds(10,370,260,30);
		txt.addKeyListener(this);
		panel.add(txt);
			
		//Btn추가
		btn1 = new JButton("입력");
		btn1.setBounds(10,410,70,30);
		btn1.addActionListener(this);	//리스너에 추가
		
		panel.add(btn1);
		btn2 = new JButton("저장");
		btn2.setBounds(90,410,70,30);
		btn2.addActionListener(this);	//리스너에 추가
		panel.add(btn2);
		
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("입력");
			//txt의 내용을 area로 전달
			area.append("[ ME ] : "+txt.getText()+"\n");
			//txt는 비움
			txt.setText("");
			
		}
		else if(e.getSource()==btn2) {
//			System.out.println(area.getText());
			
			try {
				Writer out=new FileWriter("c:/test/dialog.txt",true);
				Date cur = new Date(); //java.util.Date
				out.write("\n"+cur+"\n");
				out.write(area.getText());
				out.flush();
				out.close();
				
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			
			
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10) {
			//txt의 내용을 area로 전달
			area.append("[ ME ] : "+txt.getText()+"\n");
			//txt는 비움
			txt.setText("");
		};
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class C03Client {
	public static void main(String[] args) {
		new Cgui();

	}

}
