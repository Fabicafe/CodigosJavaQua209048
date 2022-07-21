package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticosTemperatura {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double grausfah = 0;
		double celsius = 0;
		
		System.out.print("Entre com a temperatura em graus Fahrenheit: ");
		grausfah = leia.nextDouble();
		
		
		celsius = 5 * ((grausfah -32) / 9);
		
		System.out.println("O valor convertido para celsius fica: " + celsius);
		
		
				
		leia.close();
	}

}
