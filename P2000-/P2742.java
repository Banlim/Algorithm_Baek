import java.util.Scanner;

public class P2742 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n > 0 && n <= 100000) {
			for(int i = n; i > 0; i--) {
				System.out.println(i);
			}
		}
		scan.close();
	}

}
