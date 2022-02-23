package Ch24;


import java.io.*;
import java.net.*;


public class C01SocketServer {

	public static void main(String[] args) {
		
		try {
			//서버 소켓 생성
			ServerSocket server = new ServerSocket(2020);
			System.out.println("서비스 시작");

			//클라이언트 요청 처리
			Socket client = server.accept(); 
			System.out.println("Client 접속 : " + client.getInetAddress());
			//메시지 전달용 스트림 생성
			DataOutputStream out =new DataOutputStream(client.getOutputStream());
			//메시지 전달
			out.writeUTF("Server와 연결완료!");
			
			out.flush();
			out.close();
			client.close();
			server.close();
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
