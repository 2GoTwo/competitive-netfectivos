package competitive.codeforces;

import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfProb = sc.nextInt();
		int solvedProb = 0;
		while (numberOfProb-- > 0) {
			if (sc.nextInt() + sc.nextInt() + sc.nextInt() >= 2)
				solvedProb++;
		}
		System.out.println(solvedProb);
		sc.close();
	}
}
