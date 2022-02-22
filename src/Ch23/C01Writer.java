package Ch23;

import java.io.*;

public class C01Writer {

	public static void main(String[] args) {
		try {
			//전달하는 두번째인자가 true 면 이어쓰기
			//전달하는 두번째인자가 false 면 덮어쓰기(기본값)
			Writer out = new FileWriter("c:/test/01.txt",true);
			out.write("Hello world2222\n");
			out.write("TEST222\n");
			out.write("END222\n");
			out.flush();
			out.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

}
