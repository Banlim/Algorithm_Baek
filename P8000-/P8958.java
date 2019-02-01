import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String [] arr = new String[n];
		int [] arrCnt = new int[n];
		int [] score;
		for(int i = 0; i < n; i++) {
			arr[i] = scan.next();
		}
		for(int i = 0; i < n; i++) {
			if(arr[i].charAt(0) == 'O') {
				arrCnt[i] = 1;
			}
		}
		
		for(int i = 0; i < n; i++) {
			score = new int[arr[i].length()];
			for(int j = 1; j < score.length; j++) {
				if(arr[i].charAt(j) == 'X') {
					continue;
				}
				else if(arr[i].charAt(j) == 'O') {
					score[j] = 1;
					if(arr[i].charAt(j-1) == 'O') {
						if(j-1 == 0) {
							score[j] = arrCnt[i] + score[j];
						}
						score[j] = score[j-1] + score[j];
					}
				}
				arrCnt[i] = arrCnt[i] + score[j];
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arrCnt[i]);
		}
		scan.close();
	}
}
