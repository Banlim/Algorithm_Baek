import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] loop = new int [n];
		String [] strLoop = new String[n];
		String [] result = new String[n];
		for(int i = 0; i < n; i++) {
			loop[i] = scan.nextInt();
			strLoop[i] = scan.next();
		}
		for(int i = 0; i < strLoop.length; i++) {
			for(int j = 0; j < strLoop[i].length(); j++) {
				for(int k = 0; k < loop[i]; k++) {
					if(result[i] == null) {
						result[i] = Character.toString(strLoop[i].charAt(j));
					}
					else
						result[i] += Character.toString(strLoop[i].charAt(j));
				}
			}
		}
		for(int i = 0; i < strLoop.length; i++) {
			System.out.println(result[i]);
		}
		scan.close();
	}
}
