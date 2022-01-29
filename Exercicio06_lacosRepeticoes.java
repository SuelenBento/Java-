package ExerciciosRepeticao27_01;

import java.util.Locale;

import java.util.Scanner;

public class Exercicio06 {
	
	/* 6.Escrever um programa que receba vários números inteiros no teclado.
	  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int media = 0, num , contador = 0, multiplo3;
		
		
		do {
			System.out.println("Dígite um número: ");
			num = leia.nextInt();
			multiplo3 = num %3;
			media = (media + num) / contador;
		}
		while (num != 0);

			System.out.println("A média dos números múltiplos de 3 é: " + media);
			leia.close();
			
		}
		
}
