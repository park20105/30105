import java.util.Scanner;

public class StarExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 개수 : ");
		int n = sc.nextInt();
		System.out.print("방향 : ");
		int x = sc.nextInt();
		
		if(x==1) {
			for(int i=1; i<=n; i++) {
				for(int j=i+n; j>n;j--) {
					System.out.print("*");
				}
				for(int j=n; j>=i;j--) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
		if(x==2) {
			for(int i=1; i<=n; i++) {
				for(int j=i; j<=n;j++) {
					System.out.print("*");
				}
				for(int j=n; j>=i;j--) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}