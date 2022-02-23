package Ch24;


import java.io.*;
import java.net.*;


public class C02SocketServer {

	public static void main(String[] args) {
		
		ServerSocket server=null;
		Socket client=null;
		DataOutputStream out=null;
		try {
			//서버 소켓 생성
			server = new ServerSocket(2020);
			System.out.println("서비스 시작");

			//클라이언트 요청 처리
			while(true) {
				client = server.accept(); 	//요청받기
				System.out.println("Client 접속 : " + client.getInetAddress());
				//메시지 전달용 스트림 생성
				out =new DataOutputStream(client.getOutputStream());
				//메시지 전달
				out.writeUTF(client.getInetAddress()+" 님 접속을 환영합니다!");
				client.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try{out.flush();}catch(Exception e) {}
			try{out.close();}catch(Exception e) {}
			try{server.close();}catch(Exception e) {}
		}

	}

}
