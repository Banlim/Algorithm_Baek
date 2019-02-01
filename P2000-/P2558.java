import java.util.Scanner;

public class P2558 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a>0 && b < 10) {
			System.out.println(a+b);
		}
		scan.close();
	}
}
