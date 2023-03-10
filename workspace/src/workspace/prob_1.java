package workspace;

import java.util.Scanner;

public class prob_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1000 이하의 자연수를 입력하세요.");
		int n = sc.nextInt();
		int sum = 0;
		if(n>1000) {
			System.out.println("다시 입력하세요!");
			n = sc.nextInt();
		}
		for(int i=1; i<=n; i++) {
			if(i%4==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("1~" + n + "까지 4의 배수의 합은 " + sum + "입니다");
	}

}
