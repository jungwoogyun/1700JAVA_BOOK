package DBConn;

import java.sql.*;

public class C01DBConn {

	public static void main(String[] args) {

		Connection conn=null;
		PreparedStatement pstmt = null;
		String id="root";
		String pw="Zhfldk11!"; //코리아11!
		String url="jdbc:mysql://192.168.3.254:3330/javatestdb";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 적재 완료");
			conn=DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected...");
			pstmt = conn.prepareStatement("insert into std_tbl values('ccc','씨이','서울')");
			int result=pstmt.executeUpdate();
			if(result!=0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {	
			try{pstmt.close();}catch(Exception e) {}
			try{conn.close();}catch(Exception e) {}		
		}
		
		
		
	}

}
