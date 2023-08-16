package com.HackerEarth;

import java.util.Scanner;

public class AliAndHelpingInnocent {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		char[] ch = name.toCharArray();
		boolean flag = true;

		if ((ch[0] + ch[1]) % 2 != 0) {
			flag = false;
		}

		if (flag && (ch[2] == 'A') || (ch[2] == 'E') || (ch[2] == 'I') || (ch[2] == 'O') || (ch[2] == 'U')
				|| (ch[2]) == 'Y') {
			flag = false;
		}
		if (flag && (ch[3] + ch[4]) % 2 != 0) {
			flag = false;
		}
		if (flag && (ch[4] + ch[5]) % 2 != 0) {
			flag = false;
		}
		if (flag && (ch[7] + ch[8]) % 2 != 0) {
			flag = false;
		}

		if (flag) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}

	}
}
