import java.util.Scanner;

public class P10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] temp = new int[n];
		if((n >= 1 && n <= 10000) && (x >= 1 && x <= 10000)) {
			for(int i = 0; i < n; i++) {
				temp[i] = scan.nextInt();
			}
			for(int i = 0; i < n; i++) {
				if(temp[i] < x) {
					System.out.print(temp[i] + " ");
				}
			}
		}
		scan.close();
	}
}
