import java.util.Scanner;

public class P2448 {
	private static String [] str;
	
	public P2448(int n) {
		str = new String[n];
		str[0] = "  *  ";
		str[1] = " * * ";
		str[2] = "*****";
	}
	
	void drawStar(int n) {
		int j = n;
		if(n <= 3) {
			return;
		}
		drawStar(j/2);
		String space = "";
		for(int i = 0; i < (n/2); i++) {
			space += " ";
		}
		for(int i = n-1; i >= (n/2); i--){
			str[i] = str[i-(n/2)] + " " + str[i-(n/2)];
		}
		for(int i = 0; i < (n/2); i++) {
			str[i] = space + str[i] + space;
		}
		
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		P2448 problem = new P2448(n);
		
		problem.drawStar(n);
		
		
		
		for(int i = 0; i < n; i++) {
			System.out.println(str[i]);
		}
		scan.close();

	}
}
