import java.util.Arrays;
import java.util.Scanner;
public class P1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double [] score = new double[n];
		double sum = 0;
		for(int i = 0; i < n; i++) {
			score[i] = scan.nextDouble();
		}
		Arrays.sort(score);
		double max = score[n-1];
		for(int i = 0; i < n; i++) {
			score[i] = (score[i]/max * 100);
			sum += score[i];
		}
		System.out.println(sum/n);
		scan.close();
	}
}
