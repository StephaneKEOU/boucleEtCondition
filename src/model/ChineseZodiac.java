package model;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.println("You just entered " + year);
		
		String[] signe= {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon",
				"snake","horse","sheep"};

		switch (year % 12) {
		case 0:
			System.out.println("Ton signe astrologique est chinois " +signe[0]);

			break;

		case 1:
			System.out.println("Ton signe astrologique est chinois " +signe[1]);
			break;
		case 2:
			System.out.println("Ton signe astrologique est chinois " +signe[2]);
			break;
		case 3:
			System.out.println("Ton signe astrologique est chinois " +signe[3]);
			break;
		case 4:
			System.out.println("Ton signe astrologique est chinois " +signe[4]);
			break;
		case 5:
			System.out.println("Ton signe astrologique est chinois " +signe[5]);
			break;
		case 6:
			System.out.println("Ton signe astrologique est chinois " +signe[6]);
			break;
		case 7:
			System.out.println("Ton signe astrologique est chinois " +signe[7]);
			break;
		case 8:
			System.out.println("Ton signe astrologique est chinois " +signe[8]);
			break;
		case 9:
			System.out.println("Ton signe astrologique est chinois " +signe[9]);
			break;
		case 10:
			System.out.println("Ton signe astrologique est chinois " +signe[10]);
			break;
		case 11:
			System.out.println("Ton signe astrologique est chinois " +signe[11]);
			break;

		default:
			System.out.println("Année négatif, veuillez entrer une valeur positive!");
			break;
		}
		
		
		input.close();
	}

}
