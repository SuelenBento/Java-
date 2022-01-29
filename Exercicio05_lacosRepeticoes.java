package ExerciciosRepeticao27_01;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 *  No final, mostre a soma dos números digitados.(DO...WHILE)*/

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double soma, media, acm = 0, num;
		
		do {
			System.out.println("Dígite um número: ");
			num = leia.nextDouble();
			acm = acm + num;
		}
		while (num != 0);
	
		System.out.println("Você acumulou: " + acm);
		 leia.close();
	}

}
