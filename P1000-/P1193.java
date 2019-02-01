import java.util.Scanner;

public class P1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		n = 2 * n;
		int i = 1;
		while(true) {
			int j = i;
			j = j * (j+1);
			if(j >= n) {
				break;
			}
			i++;
		}
		int res = 0;
		for(int k = 1; k < i; k++) {
			res += k;
		}
		int r = n/2 - res;
		if(i%2 == 1) {
			int up = (i+1) - r;
			System.out.println(up + "/" + r);
		}
		else {
			int down = (i+1) - r;
			System.out.println(r + "/" + down);
		}
		scan.close();
	}
}
