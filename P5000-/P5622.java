import java.util.Scanner;

public class P5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i) - 'A') {
			case 0:
			case 1:
			case 2:
				cnt += 3;
				break;
			case 3:
			case 4:
			case 5:
				cnt+= 4;
				break;
			case 6:
			case 7:
			case 8:
				cnt += 5;
				break;
			case 9:
			case 10:
			case 11:
				cnt += 6;
				break;
			case 12:
			case 13:
			case 14:
				cnt += 7;
				break;
			case 15:
			case 16:
			case 17:
			case 18:
				cnt += 8;
				break;
			case 19:
			case 20:
			case 21:
				cnt += 9;
				break;
			case 22:
			case 23:
			case 24:
			case 25:
				cnt += 10;
				break;
			}
		}
		System.out.println(cnt);
		scan.close();
	}
}
