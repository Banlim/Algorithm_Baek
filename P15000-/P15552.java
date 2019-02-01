import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class P15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String s = "";
		int a, b;
		int[] sum = new int[n];
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum[i] = a+b;
		}
		for(int i = 0; i < n; i++) {
			bw.write(sum[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
