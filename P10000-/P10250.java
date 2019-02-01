import java.util.Scanner;

public class P10250 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i = 0; i < test; i++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();
			
			int down = n/h + 1;
			int up = n%h;
			if(up == 0) {
				up = h;
				down = down-1;
			}
			if(down < 10) {
				System.out.println(up + "0" + down);
			}
			else {
				System.out.println(up + "" + down);
			}
		}
		scan.close();
	}
}
