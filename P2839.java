import java.util.Scanner;

public class P2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, nn, res, cnt;
		n = scan.nextInt();
		nn = 0;
		res = 0;
		cnt = 0;
		if(n >= 3 && n <= 5000) {
			for(int i = (n/5); i >= 0; i--) {
				cnt = i;
				nn = n-(i*5);
				res = nn/3;
				if(nn%3 == 0) {
					cnt += res;
					break;
				}	
			}
		}
		if(nn%3 != 0) {
			cnt = -1;
		}
		System.out.println(cnt);
		scan.close();
	}

}
