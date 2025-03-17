package exerciciosLoop;

import java.util.Scanner;

public class dowhileloop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero, multiplicador = 1;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		do {
			
			int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);   
            multiplicador++;
            
		} while (multiplicador <= 10 );
		
		}

}
