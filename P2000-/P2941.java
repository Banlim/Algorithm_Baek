import java.util.Scanner;

public class P2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int wordCnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(i+1 == str.length()) {
				wordCnt++;
				break;
			}
			if(str.charAt(i) == 'c') {
				if(str.charAt(i+1) == '=') {
					i++;
					wordCnt++;
				}
				else if(str.charAt(i+1) == '-') {
					i++;
					wordCnt++;
				}
				else
					wordCnt++;
			}
			else if(str.charAt(i) == 'd') {
				if(str.charAt(i+1) == '-') {
					i++;
					wordCnt++;
				}
				else if(str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {
					i += 2;
					wordCnt++;
				}
				else 
					wordCnt++;
			}
			else if(str.charAt(i) == 'l' && str.charAt(i+1) == 'j') {
				i++;
				wordCnt++;
			}
			else if(str.charAt(i) == 'n' && str.charAt(i+1) == 'j') {
				i++;
				wordCnt++;
			}
			else if(str.charAt(i) == 's' && str.charAt(i+1) == '=') {
				i++;
				wordCnt++;
			}
			else if(str.charAt(i) == 'z' && str.charAt(i+1) == '=') {
				i++;
				wordCnt++;
			}
			else {
				wordCnt++;
			}
		}
		System.out.println(wordCnt);
		scan.close();
	}
}
