import java.util.Scanner;

public class P2741 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n > 0 && n <= 100000) {
			for(int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}
		scan.close();

	}

}
