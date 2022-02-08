package Ch11;

import java.util.Scanner;

public class C02Arraymain {

	public static void main(String[] args) {
		//Scanner를 와 int형 배열길이 5개를 만들고
		//각 요소에 값을 넣고 총합/평균을 구하세요~
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum+","+((double)sum/5));

	}

}
