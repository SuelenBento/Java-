package ExerciciosLacosDecisoes27_01;


import java.util.Locale;
import java.util.Scanner;

/* 3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
    � 10-14 infantil
    � 15-17 juvenil
    � 18-25 adulto */

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int idade;
		
		System.out.println("D�gite sua idade: ");
		idade = leia.nextInt();
		
			if (idade >=10 && idade <=14) {
			System.out.println("Voc� � do grupo infantil!");
			}
		
			else if(idade >= 11 && idade <= 17) {
				System.out.println("Voc� � do grupo juvenil!");
		    }
	
			else if(idade >= 18 && idade <= 25) {
				System.out.println("Voc� � do grupo adulto");
		    }
			
			else {
				System.out.println("Voc� n�o pertence a nenhum grupo");
				
			}
			
			 leia.close();
		
	}

}
