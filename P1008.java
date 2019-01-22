import java.util.Scanner;

public class P1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		double res = 0;
		if (a > 0 && b < 10) {
			res = (double)a/(double)b;
		}
		System.out.println(res);
		scan.close();

	}

}
