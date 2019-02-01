import java.util.Scanner;

public class P2775 {
	
	void peopleSum(int k, int n, int[]res){
		if(k == 0) {
			return;
		}
		peopleSum(k-1, n, res);
		for(int i = 1; i < n; i++) {
			res[i] = res[i-1] + res[i];
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		P2775 problem = new P2775();
		for(int i = 0; i < test; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			int []res = new int[n];
			for(int j = 0; j < n; j++) {
				res[j] = j+1;
			}
			problem.peopleSum(k, n, res);
			System.out.println(res[n-1]);
		}
		scan.close();
	}
}
