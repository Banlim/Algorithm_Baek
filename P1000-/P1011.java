import java.util.Scanner;

public class P1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		int []res = new int[test];
		for (int i = 0; i < test; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int dist = (int)Math.ceil(Math.sqrt(y-x));
			int real = y-x;
			
			int result = (int)Math.pow(dist, 2) - real;
			if(result >= dist) {
				res[i] = dist + dist - 2;
			}
			else {
				res[i] = dist + dist - 1;
			}
			
		}
		for(int i = 0; i < test; i++) {
			System.out.println(res[i]);
		}
		scan.close();
	}
}
