package ExerciciosRepeticao27_01;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double soma, media, acm = 0, num;
		
		do {
			System.out.println("D�gite um n�mero: ");
			num = leia.nextDouble();
			acm = acm + num;
		}
		while (num != 0);
	
		System.out.println("Voc� acumulou: " + acm);
		 leia.close();
	}

}
