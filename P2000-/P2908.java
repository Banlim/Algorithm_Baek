import java.util.Scanner;

public class P2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String aAns = Character.toString(a.charAt(a.length()-1));
		String bAns = Character.toString(b.charAt(b.length()-1));
		for(int i = 1; i < a.length(); i++) {
			aAns += Character.toString(a.charAt(a.length()-i-1));
		}
		for(int i = 1; i < b.length(); i++) {
			bAns += Character.toString(b.charAt(b.length()-i-1));
		}
		if(Integer.parseInt(aAns) > Integer.parseInt(bAns)) {
			System.out.println(aAns);
		}
		else {
			System.out.println(bAns);
		}
		scan.close();
	}
}
