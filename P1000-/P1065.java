import java.util.Scanner;

public class P1065 {
	private static int cnt = 0;
	void Hansu(int n) {
		if(n == 0) {
			return;
		}
		int j = n;
		int k = 0;
		String str = Integer.toString(n);
		int [] strr = new int[str.length()];
		int [] temp = new int[strr.length-1];
		boolean TF = true;
		for(int i = 0; i < strr.length; i++) {
			strr[i] = Integer.parseInt(Character.toString(str.charAt(i)));
		}
		while(k < strr.length-1) {
			temp[k] = strr[k+1] - strr[k];
			if(k >= 1 && (temp[k-1] != temp[k])) {
				TF = false;
				break;
			}
			k++;
		}
		if(TF == true) {
			cnt++;
		}
		j--;
		Hansu(j);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		P1065 problem = new P1065();
		int n = scan.nextInt();
		if(n<=1000) {
			problem.Hansu(n);
		}
		System.out.println(cnt);
		scan.close();

	}

}
