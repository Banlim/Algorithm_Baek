import java.util.Scanner;

public class P10430 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if (a >= 2 && c <= 10000) {
			System.out.println((a+b)%c);
			System.out.println(((a%c) + (b%c))%c);
			System.out.println((a*b)%c);
			System.out.println(((a%c)*(b%c))%c);
		}
		scan.close();
	}
}
