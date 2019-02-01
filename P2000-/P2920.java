import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] melody = new int [8];
		String cnt = "";
		for(int i = 0; i < 8; i++) {
			melody[i] = scan.nextInt();
		}
		if(melody[1] - melody[0] == 1) cnt = "asc";
		else if(melody[1] - melody[0] == -1) cnt = "des";
		else cnt = "mix";
		
		for(int i = 1; i < 7; i++) {
			if(melody[i+1] - melody[i] == 1 && cnt == "asc") {
				cnt = "asc";
			}
			else if(melody[i] - melody[i-1] == -1 && cnt == "des") {
				cnt = "des";
			}
			else
				cnt = "mix";
		}
		switch(cnt) {
		case "asc" :
			System.out.println("ascending");
			break;
		case "des" :
			System.out.println("descending");
			break;
		case "mix":
			System.out.println("mixed");
			break;
		}
		scan.close();	
	}
}
