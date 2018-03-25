//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie:
		// http://vimeo.com/2485018

		Random randomMaker = new Random();

		

		// 2. On paper, write all the numbers that get printed when you run this class
		// 10 times
		// 0412404004


		// 3. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 11; i++) {
			int randomNumber = randomMaker.nextInt(5);
			if (randomNumber == 0) {
				System.out.println("You have powerful features");
			} else if (randomNumber == 1) {
				System.out.println("You  have beautiful eyes");
			} else if (randomNumber == 2) {
				System.out.println("Your hair is neat");
			} else if (randomNumber == 3) {
				System.out.println("You look nice");
			} else if (randomNumber == 4) {
				System.out.println("Your glaSSES LOOK NICE");
			}
		}
		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}
