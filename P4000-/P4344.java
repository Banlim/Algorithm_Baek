import java.util.Scanner;

public class P4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int [] score;
		double [] percent = new double [c];
		int sum = 0;
		int cnt = 0;
		double E = 0;
		for(int i = 0; i < c; i++) {
			int n = scan.nextInt();
			score = new int[n];
			sum = 0;
			cnt = 0;
			if(n >= 1 && n <= 1000) {
				for(int j = 0; j < n; j++) {
					score[j] = 0;
					score[j] = scan.nextInt();
					sum += score[j];
				}
				E = (double)sum/(double)n;
				
				for(int j = 0; j < n; j++) {
					if(E < score[j]) {
						cnt += 1;
					}
				}
				percent[i] = 100 * (double)cnt/(double)n;
			}
			System.out.printf("%.3f", 100.0 * cnt / n);
			System.out.println("%");
		}
		scan.close();
	}
}
