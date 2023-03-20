package test0317;

import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("당신의 선택은 : ");
		
		String[] a = {"가위","바위","보"};
		int b = rd.nextInt(3);
		String d = a[b];
		String c = sc.next();
		
		System.out.println("컴퓨터의 선택은 : " + d);
		
		if(d.equals("가위") == c.equals("보")&&
		   d.equals("바위") == c.equals("가위")&&
		   d.equals("보") == c.equals("바위")) {
			System.out.println("패배입니다.");
		}
		
		else if(d.equals("바위") == c.equals("보")&&
		   d.equals("보") == c.equals("가위")&&
		   d.equals("가위") == c.equals("바위")) {
			System.out.println("승리입니다.");
		}
		
		else {
			System.out.println("무승부입니다.");
		}
	}

}
