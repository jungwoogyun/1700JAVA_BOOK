package Ch07;

import java.util.Scanner;

public class C03While {

	public static void main(String[] args) throws InterruptedException {

		// break : 반복문 벗어날때(가장 근접한 반복문 or Switch문을 벗어남)
		
//		int cnt=0;
//		while(true) {
//			System.out.println("Cnt : "+(cnt++));
//			Thread.sleep(500);
//			if(cnt==25) {
//				break;
//			}
//		}
		
		//문제 
		//정수를 -1을 입력받기전까지 무한대로 입력받아 그정수들의
		//총합을 출력해보세요~
		
//		Scanner sc = new Scanner(System.in);
//		int sum=0;	//총합누적용
//		int tmp=0;	//키보드 입력받기용
//		while(true)
//		{
//			System.out.print("입력(종료:-1) : ");
//			tmp=sc.nextInt();
//			if(tmp==-1)
//			{
//				break;
//			}
//			sum+=tmp;//sum에 tmp를 누적
//			
//		}
//		System.out.println("총합 : " + sum);
//		
		
		
		//continue 반복문의 조건식으로 이동
		
//		int cnt=0;
//		while(cnt<=20)
//		{
//			
//			System.out.println("CNT : " + (cnt));
//			Thread.sleep(500);
//			if(cnt==15) {
//				cnt++;
//				continue;//반복문의 조건식으로 돌아감
//			}
//			cnt++;
//		}
		
		//1부터 20까지의 수중의 3의배수는 제외하고 나머지 숫자들을 출력
		
		int i=1;
		while(i<=20)
		{
			if(i%3==0) {
				i++;
				continue;
			}
			System.out.println("i : " + i);
			i++;
			Thread.sleep(500);
		}
		

	}

}
