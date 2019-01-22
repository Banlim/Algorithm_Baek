import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int [] result = new int[26];
		for(int i = 0; i < 26; i++) {
			result[i] = -1;
		}
		for(int i = 0; i < word.length(); i++) {
			int wordCnt = word.charAt(i) - 65;
			if(wordCnt >= 32) {
				wordCnt = wordCnt - 32;
			}
			result[wordCnt] += 1;
		}
		int max = result[0];
		int maxCnt = 0;
		boolean TF = true;
		for(int i = 1; i < 26; i++) {
			if(max < result[i]) {
				max = result[i];
				maxCnt = i;
				TF = true;
			}
			else if(max == result[i]) {
				TF = false;
				continue;
			}
			else if(result[i] == -1) {
				continue;
			}
		}
		maxCnt= maxCnt+65;
		if(TF) 
			System.out.println((char) maxCnt);
		else
			System.out.println("?");
		
		scan.close();
	}

}
