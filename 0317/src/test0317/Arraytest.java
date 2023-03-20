package test0317;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		ArrayList<String> a1 = new ArrayList<String>();
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력해 주세요.");
			String n = sc.next();
			if(n.charAt(0) == '김') {
				a1.add(n);
				num++;
			}
		}
		System.out.println("성이 '김'인 분의 이름을 모두 출력합니다.");
		System.out.println(a1);
		System.out.println("김씨 성을 가진 분은 모두 " + num + "명 입니다.");
	}

}
