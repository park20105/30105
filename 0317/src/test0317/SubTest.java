package test0317;

import java.util.Scanner;

public class SubTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String a = sc.next();
		
		int size = a.length();
		int cut_length = 3;
		
		System.out.println(a.substring(size - cut_length));
	}

}
