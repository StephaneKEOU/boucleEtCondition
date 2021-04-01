package model;


import java.util.Scanner;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {
		System.out.println("Veuillez entrer trois chiffres compris entre 0 et 1000");
		Scanner enter = new Scanner(System.in);
		int[] tab=new int[3];
		
		//System.out.println(tab[0]+ " " +tab[1]+ " " + tab[2]);
		do {
			tab[0]=enter.nextInt();
			//System.out.println();
			tab[1]=enter.nextInt();
			//System.out.println();
			tab[2]=enter.nextInt();
			
		} while (!((tab[0]%2==0 && tab[1]%2 ==0) && (tab[2]%2!=0 )));
		
		
		System.out.println("Vous avez réussi!");

	}

}
