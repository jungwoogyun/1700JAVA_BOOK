package Ch23;

import java.io.*;

public class C02Reader {

	public static void main(String[] args) {
		
		try {
			
			Reader in = new FileReader("c:/test/01.txt");
			int tmp=0;
			while(true) {
				tmp=in.read();	//읽은 단일문자 리턴, 더이상읽을게 없으면 -1리턴
				if(tmp==-1)
					break;
				System.out.print((char)tmp);
			}
			
		}catch(Exception e) {
			
		}
		

	}

}
