package Exercicios;

import java.util.Random;

public class exercicio02 {
	/*Um dado  lançado 10 vezes e o valor correspondente   anotado. Faça um programa que gere um vetor com os lançamentos, 
	  escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas
	  foram as ocorrências da maior pontuação*/


		public static void main(String[] args) {
			Random jogo = new Random();

			int[] entradaDados = new int[10];
			int maiorNum = 0, media = 0, vezesJogado = 0;

			for (int i = 0; i < 10; i++) {
				entradaDados[i] = jogo.nextInt(5) + 1;
				media = media + entradaDados[i];
				if (entradaDados[i] > maiorNum) {
					maiorNum = entradaDados[i];
				}
				System.out.println();
				System.out.println(i + 1 + " O número sorteado foi: " + entradaDados[i]);
			}
			for (int i = 0; i < 10; i++) {
				if (entradaDados[i] == maiorNum) {
					vezesJogado++;
				}
			}

				System.out.println("A média aritmética de todos os lançamentos foi de: " + media / 10);
				System.out.println("O maior número foi: " + maiorNum + " e ele foi jogado " + vezesJogado + " vezes!");
			
		}

	}


