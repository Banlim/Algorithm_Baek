import java.util.Scanner;

public class P2441 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n >= 1 && n <= 100) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for(int j = n; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
