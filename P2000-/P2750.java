import java.util.Arrays;
import java.util.Scanner;

public class P2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nCnt = scan.nextInt();
		int [] number = new int[nCnt];
		for(int i = 0; i < nCnt; i++) {
			number[i] = scan.nextInt();
		}
		Arrays.sort(number);
		for(int i = 0; i < nCnt; i++) {
			System.out.println(number[i]);
		}
		scan.close();
	}
}
