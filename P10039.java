import java.util.Scanner;

public class P10039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] score = new int[5];
		for(int i = 0; i < 5; i++) {
			score[i] = scan.nextInt();
			if(score[i] < 40) {
				score[i] = 40;
			}
		}
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += score[i];
		}
		System.out.println(sum/5);
		scan.close();
	}
}
