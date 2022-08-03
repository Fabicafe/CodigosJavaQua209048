package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AlcoolOuGasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double alcool = 0.0;
		double gasolina = 0.0;

		System.out.print("Entre com o valor doo alcool: ");
		alcool = sc.nextDouble();

		System.out.print("Entre com o valor da gasolina: ");
		gasolina = sc.nextDouble();

		GasOuAlc(alcool, gasolina);

		sc.close();
	}

	public static void GasOuAlc(double a, double g) {
		if (g / a >= 0.70) {
			System.out.print("Compensa abastecer com gasolina!");
		} else {
			System.out.print("Compenss abastecer com gasolina");
		}
	}
}
