// Author:Jackie Zablah. Java Bootcamp 2019

//Calculate the difference as an absolute value of 2 strings entered by a user,
//based on the unicode assignment of the characters in each string.

package lab1_2;

import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {
		String word1;
		String word2;
		Scanner scnr = new Scanner(System.in);
		int sum1;
		int sum2;
		int difference;
		String userChoice = "";

		do {
			word1 = "";
			word2 = "";
			sum1 = 0;
			sum2 = 0;
			difference = 0;
			System.out.println("Enter a String: <<");
			word1 = scnr.next();
			System.out.println("Enter a String: <<");
			word2 = scnr.next();

			for (int i = 0; i < word1.length(); i++) {
				System.out.println(word1.charAt(i) + ":" + (int) word1.charAt(i));
				sum1 += (int) word1.charAt(i);
			}
			for (int i = 0; i < word2.length(); i++) {
				System.out.println(word2.charAt(i) + ":" + (int) word2.charAt(i));
				sum2 += (int) word2.charAt(i);
			}
			difference = Math.abs(sum1 - sum2);
			System.out.println("Difference (as absolute value): " + difference);
			System.out.println("Would you like to continue (y/n)? <<");
			userChoice = scnr.next();
			if (userChoice.equalsIgnoreCase("n"))
				System.out.println("GoodBye!!");
		} while (userChoice.equalsIgnoreCase("y"));
		scnr.close();

	}

}
