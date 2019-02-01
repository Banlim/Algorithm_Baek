import java.util.Arrays;
import java.util.Scanner;

public class P1475 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int [] TF = new int[10];
		int wordCnt = 1;
		for(int i = 0; i < n.length(); i++) {
			int number = n.charAt(i) - '0';
			if(number == 6) {
				int dif = TF[number] - TF[9];
				switch(dif) {
				case 1:
					TF[9] += 1;
					break;
				case 0:
				case -1:
					TF[number] += 1;
					break;
				}
			}
			else if(number == 9) {
				int dif = TF[number] - TF[6];
				switch(dif) {
				case 1:
					TF[6] +=1;
					break;
				case 0:
				case -1:
					TF[number] += 1;
					break;
				}
			}
			else {
				TF[number] += 1;
			}
		}
		Arrays.sort(TF);
		System.out.println(TF[9]);
		scan.close();
	}
}
