package test_0316;

import java.util.Random;
import java.util.Scanner;

public class RandExam {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = 0;
		for(int i=1; i<=n; i++) {
			int a = rd.nextInt(20);
			System.out.println(i + "번째 숫자는 " + a + "입니다.");
			b += a;
		}
		System.out.println("주사위를 " + n + "번 던질 결과, 총 합은 " + b + "입니다.");
	}

}
