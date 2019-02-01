import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		String str = scan.next();
		int sum = 0;
		int n = 0;
		if(cnt >= 1 && cnt <= 100) {
			for(int i = 0; i < cnt; i++) {
				n = str.charAt(i);
				n = n-48;
				sum += n;
			}
		}
		System.out.println(sum);
		scan.close();
	}
}
