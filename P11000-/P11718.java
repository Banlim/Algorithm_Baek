
import java.util.Scanner;

public class P11718 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			String st = scan.nextLine();
			if(st.length() > 100 || st.isEmpty()) {
				break;
			}
			else {
				System.out.println(st);
			}
		}
		scan.close();
	}

}
