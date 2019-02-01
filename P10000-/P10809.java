import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int [] result = new int [26];
		for(int i = 0; i < 26; i++) {
			result[i] = -1;
		}
		for(int i = 0; i < str.length(); i++) {
			int word = str.charAt(i) - 97;
			if(result[word] == -1)
				result[word] = i;
		}
		for(int i = 0; i < 26; i++) {
			System.out.print(result[i] + " ");
		}
		scan.close();
	}
}
