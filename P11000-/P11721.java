import java.util.Scanner;

public class P11721 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = 0;
		for(int i = 0; i <= (str.length()/10); i++) {
			for(int j = 0; j < 10; j++) {
				n = i * 10 + j;
				if(n == str.length()) {
					break;
				}
				System.out.print(str.charAt(n));
			}
			System.out.println();
		}
		scan.close();
	}
}
