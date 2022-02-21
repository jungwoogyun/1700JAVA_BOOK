package Ch22;

import javax.swing.JFrame;

class C02Swing extends JFrame{

	public C02Swing(){
		super("두번째 창입니다");
		setBounds(100,100,300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
}
public class C02FrameMain {
	public static void main(String[] args) {
			
		new C02Swing();

	}

}
