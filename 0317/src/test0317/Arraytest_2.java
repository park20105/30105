package test0317;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraytest_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a1 = new ArrayList<String>();
		int num=0, max=0;
		
		for(int i=0; i<5; i++) {
			System.out.println("별명을 입력해 주세요.");
			a1.add(sc.next());
		}
		
		for(int i=0; i<a1.size(); i++) {
			if(max < a1.get(i).length()) {
				max = a1.get(i).length();
				num = i;
			}
		}
		System.out.println("길이가 가장 긴 별명은 => " + a1.get(num));
	}
	}

