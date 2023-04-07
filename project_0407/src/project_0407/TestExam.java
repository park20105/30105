package project_0407;

import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b=0,c=0;
		int result=0;
		if(n>500) {
			int a = sc.nextInt();
			n=a;
		}
		for(int i=1;i<n;i++) {
			if(n/3==0) {
				b+=n;
			}
			else if(n/7==0) {
				c+=n;
			}
		}
		
	}

}
