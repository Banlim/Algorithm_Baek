import java.util.Scanner;

public class P1924 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		String[] str = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int sum = 0;
		if((x >= 1 && x <= 12) && (y >= 1 && y <= 31)) {
			for(int i = 1; i < x; i++) {
				switch(i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					sum += 31;
					break;
				case 2:
					sum += 28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					sum += 30;
					break;

				}
			}
			sum += y;
			sum = sum%7;
			System.out.println(str[sum]);
		}
		scan.close();
	}

}
