import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("수학, 과학, 영어 순으로 3과목의 점수 입력 >> ");
			int m = sc.nextInt();
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			Grade me = new Grade(m,s,e);
			System.out.println("평균은 " + me.average());
			
		}
}

	class Grade{
		int math;
		int science;
		int english;
		
		public Grade(int m, int s, int e) {
			math = m;
			science = s;
			english = e;
		}
		
		public int average() {
			return (math + science + english)/3;
		}
	}
	