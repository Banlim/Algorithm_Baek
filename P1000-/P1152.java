import java.util.Scanner;
import java.util.StringTokenizer;

public class P1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		StringTokenizer st;
		
		str = scan.nextLine();
		st = new StringTokenizer(str, " ");
		
		System.out.println(st.countTokens());
		
		scan.close();
	}

}
