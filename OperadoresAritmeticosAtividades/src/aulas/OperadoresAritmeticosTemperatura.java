package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticosTemperatura {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double grausfah = 0.00;
		double celsius = 0.00;
		
		System.out.println("Insira a temperatura em graus Fahrenheit: ");
		grausfah = leia.nextDouble ();
		
		celsius = 5.0 * (grausfah-32.0) / 9.0 ;
		
		System.out.println("A temperatura de graus Celsius é de: " + celsius);

		
		
		leia.close();
	}

}
