package Exercicios26_01;

import java.util.Scanner;

/* 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos
  (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
   escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.*/

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		  double custConsumidor, custFabrica, porcDistribuidor, impostos;
		  
		
		  System.out.println("D�gite o custo de fabrica: ");
		  custFabrica = leia.nextDouble();
		  
		  porcDistribuidor = (custFabrica * 28) /100;
		  
		  impostos = (custFabrica * 48 ) /100;
		  
		  custConsumidor = custFabrica +  impostos + porcDistribuidor;
		  
		  System.out.printf("O carro apre�o do consumidor � de :  %.2f", custConsumidor , " reais");
		  
		  leia.close();
		  
		  
				  
		
		

	}

}
