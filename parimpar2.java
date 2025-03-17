package exerciciosLoop;

import java.util.Scanner;

public class parimpar2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero= sc.nextInt();
		
		 if (numero % 2 == 0) {
	            System.out.println(numero + " é um número par.");
	        } else {
	        	System.out.println(numero + " é um número ímpar");
	        	}
		
	}

}
