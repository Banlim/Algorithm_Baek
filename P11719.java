import java.util.Scanner;
public class P11719 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str;
		while(scan.hasNext()) {
			str = scan.nextLine();
			if(str.isEmpty() || str.length() <= 100) {
				System.out.println(str);
			}
		}

		scan.close();
	}

}
