import java.util.Arrays;
import java.util.Scanner;

public class P10817 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] temp = new int[3];
		for(int i = 0; i < 3; i++) {
			temp[i] = scan.nextInt();
		}
		
		if((temp[0] >= 1 && temp[0] <= 100) && (temp[1] >= 1 && temp[1] <= 100) && (temp[2] >= 1 && temp[2] <= 100)) {
			Arrays.sort(temp);
			System.out.println(temp[1]);
		}
		scan.close();
	}
}
