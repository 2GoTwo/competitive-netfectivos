package competitive_netfectivos.codeforces;

import java.util.Scanner;

public class StrangeTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextLong();
			long m = sc.nextLong();
			long x = sc.nextLong();

			x--;
			long row = x / n;
			long col = x % n;
			
			System.out.println(row * m + col + 1);

		}
		sc.close();
	}
}
