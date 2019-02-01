
public class P4673 {
	private static int [] num = new int[10001];
	
	public P4673() {
		for(int i = 1; i <= 10000; i++) {
			num[i] = i;
			
		}
	}
	void Plus(int number) {
		
		if(number < num.length) {
			String str = Integer.toString(number);
			int sum = number;
			int [] n = new int[str.length()];
			for(int i = 0; i < str.length(); i++) {
				n[i] = Integer.parseInt(Character.toString(str.charAt(i)));
				sum += n[i];
			}
			
			if(sum < num.length) {
				num[sum] = 0;
				Plus(sum);
			}
			else {
				return;
			}
		}
		else {
			return;
		}
	}

	public static void main(String[] args) {
		P4673 problem = new P4673();
		int j = 1;
		int [] ans;
		int cnt = 0;
		while(j <= 10000) {
			if(num[j] == 0) {
				j++;
				continue;
			}
			problem.Plus(j);
			j++;
		}
		for(int i = 1; i <= 10000; i++) {
			if(num[i] == 0) {
				continue;
			}
			else {
				System.out.println(num[i]);
			}
		}
	}
}
