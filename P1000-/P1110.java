import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = "";
		String temp = "";
		int trueStr = 0;
		int cnt = 0;
		if(n >= 0 && n <= 99) {
			str = Integer.toString(n);
			trueStr = n;
			if(n >= 0 && n < 10) {
				str = str + (n+0);
				cnt++;
			}
			else {
				int c = str.charAt(0) - 48;
				int d = str.charAt(1) - 48;
				temp = Integer.toString(c+d);
				str = Character.toString(str.charAt(1)) + Character.toString(temp.charAt(temp.length()-1));
				cnt++;
			}
		
			while(Integer.parseInt(str) != trueStr) {
				int a = str.charAt(0) - 48;
				int b = str.charAt(1) - 48;
				temp = Integer.toString(a+b);
				str = Character.toString(str.charAt(1)) + Character.toString(temp.charAt(temp.length()-1));
				cnt++;
			}
		}
		System.out.println(cnt);
		scan.close();
	}
}
