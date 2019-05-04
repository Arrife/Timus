import java.io.*;
import java.util.*;

public class ReverseRoot implements Runnable {
	public StringTokenizer strtok;
	public BufferedReader inr;
	public PrintWriter out;

	public static void main(String[] args) {
		new Thread(new ReverseRoot()).start();
	}

	public static final String taskname = "ReverseRoot";

	public void run() {
		Locale.setDefault(Locale.US);
		boolean oj = System.getProperty("ONLINE_JUDGE") != null;
		//oj = true;
		try {
			inr = new BufferedReader(oj ? new InputStreamReader(System.in, "ISO-8859-1") : new FileReader(taskname + ".in"));
			out = new PrintWriter(oj ? new OutputStreamWriter(System.out, "ISO-8859-1") : new FileWriter(taskname + ".out"));
			solve();
		} catch (Exception e) {
			if (!oj)
				e.printStackTrace();
			System.exit(9000);
		} finally {
			out.flush();
			out.close();
		}
	}

	public String nextToken() throws IOException {
		while (strtok == null || !strtok.hasMoreTokens()) {
			strtok = new StringTokenizer(inr.readLine());
		}
		return strtok.nextToken();
	}

	public int nextInt() throws NumberFormatException, IOException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws NumberFormatException, IOException {
		return Long.parseLong(nextToken());
	}

	public double nextDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(nextToken());
	}

	// Debugging

	public static void printArray(boolean[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] ? '#' : '.');
			}
			System.out.print('\n');
		}
	}

	// Solution


	public void solve() throws NumberFormatException, IOException {
		Stack<Long> a = new Stack<Long>();
		while(true) {
			try {
				a.push(nextLong());
			} catch (NullPointerException e) {
				break;
			}
		}
		while(!a.empty())
			out.printf("%.4f\n", Math.sqrt(a.pop()));
	}
}