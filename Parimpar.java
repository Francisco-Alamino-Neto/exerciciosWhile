package exerciciosLoop;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 1;

		while (numero != 0) {

			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				System.out.println(numero + " é um número par.");
			} else {
				System.out.println(numero + " é um número ímpar.");
			}

		}
	}

}
