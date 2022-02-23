package Ch24;

import java.io.*;
import java.net.*;


public class C01SocketClient {

	public static void main(String[] args) {
		
		Socket client=null;
		DataInputStream in=null;
		try {
			//전화걸기
			client = new Socket("192.168.3.254",2020);
			System.out.println("Server와 연결완료");
			//수신하기
			in = new DataInputStream(client.getInputStream());
			String result = in.readUTF();
			System.out.println("서버전달 메시지 : " + result);	
			//자원제거
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{in.close();}catch(Exception e) {}
			try{client.close();}catch(Exception e) {}
		}
		

	}

}
