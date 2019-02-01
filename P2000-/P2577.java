import java.util.Scanner;

public class P2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int [] arr = new int[10];
		
		int result = a*b*c;
		
		while(result !=0) {
			arr[result%10]++;
			result = result/10;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
		scan.close();

	}

}
