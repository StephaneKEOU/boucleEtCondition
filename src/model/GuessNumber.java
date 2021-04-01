package model;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		int rnum = (int) (Math.random()) * 10;
		System.out.println(rnum);
		System.out.print("Choisir un nombre entre 0 et 9 (0 et 9 compris) ");
		int i = 0;
		Scanner enter = new Scanner(System.in);
		int input = -1;

		do {

			input = enter.nextInt();

			i += 1;

			if (input < rnum) {
				System.out.println("Le nombre saisi est plus grand ");

			}

			else {
				System.out.println("Le nombre saisi est plus petit ");

			}

		} while (input != rnum);

		System.out.println("Bravo le nombre est: " + rnum);
		System.out.println("Vous avez trouvé la réponse après " + i + " essai (s)");
		enter.close();
	}

}
