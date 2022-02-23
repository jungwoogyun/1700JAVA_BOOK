package Ch24;

import java.net.*;
import java.io.*;

public class C03ServerBackground {
	//멤버변수
	private ServerSocket server;
	private Socket client;
	private DataInputStream in;
	private DataOutputStream out;
	private Sgui gui;
			
	//생성자 호출
	
	public C03ServerBackground(Sgui gui){
		this.gui=gui;
		try {
			//전화기 생성
			server = new ServerSocket(3030);
			//연결받기(1회)
			client = server.accept();
			//in/out 스트림 객체 연결
			in = new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
			//무한루프(수신)
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
