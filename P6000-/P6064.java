import java.util.Scanner;

public class P6064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i = 0; i < test; i++) {
			int M = scan.nextInt();
			int N = scan.nextInt();
			int X = scan.nextInt();
			int Y = scan.nextInt();
			int x = 1;
			int y = 1;
			int cnt = 1;
			int d = 1;
			
			for( ; ;) {
				if(x == X)
					d = M;
				else if(y == Y)
					d = N;
				
				x = ((x+d)%M == 0) ? M : (x+d)%M;
				y = ((y+d)%N == 0) ? N : (x+d)%N;
				
				cnt += d;
				
				if(x == X && y == Y)
					break;
				if(cnt > M*N) {
					cnt = -1;
					break;
				}
			}
			System.out.println(cnt);
		}
		scan.close();
	}
}
