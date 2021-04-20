package competitive.codeforces;

import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String letters = "abcdefghijklmnopqrstuvwxyz";
		int distinct = 0;
		for (int i = 0; i < letters.length(); i++) {
			if (name.contains(letters.charAt(i) + ""))
				distinct++;
		}
		if (distinct % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
		sc.close();
	}

}
