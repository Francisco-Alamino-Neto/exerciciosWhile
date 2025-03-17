package exerciciosLoop;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cronometro = 1;
		
		while (cronometro < 11) {
			System.out.println(cronometro);
			cronometro = (cronometro + 1);
		}
		
	}

}
