package competitive.codeforces;

import java.util.Scanner;

public class Tram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stops = sc.nextInt();
		int passengers = 0;
		int minCapacity = 0;
		for (int i = 1; i <= stops; i++) {
			passengers = passengers - sc.nextInt() + sc.nextInt();
			if (passengers > minCapacity)
				minCapacity = passengers;
		}
		System.out.println(minCapacity);
		sc.close();
	}
}
