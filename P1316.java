import java.util.Scanner;

public class P1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean[] result = new boolean[26];
		String word;
		int wordCnt = 0;
		boolean TF = true;
		int pre_char = -1;
		for(int i = 0; i < n; i++) {
			word = scan.next();
			for(int j = 0; j < word.length(); j++) {
				int str = word.charAt(j) - 'a';
				if(j == word.length()) {
					TF = true;
					break;
				}
				if(result[str] && pre_char == str) {
					continue;
				}
				else if(result[str] && pre_char != str) {
					TF = false;
					break;
				}
				else {
					result[str] = true;
				}
				pre_char = str;
			}
			for(int j = 0; j < word.length(); j++) {
				int str = word.charAt(j) - 'a';
				result[str] = false;
			}
			if(TF) {
				wordCnt++;
			}
			TF = true;
		}
		System.out.println(wordCnt);
		scan.close();
	}
}
