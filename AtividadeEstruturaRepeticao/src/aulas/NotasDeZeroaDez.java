package aulas;

import java.util.Locale;
import java.util.Scanner;

public class NotasDeZeroaDez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double nota = 0.0;

		do {
			System.out.println("Entre com uma nota entre 0 e 10: ");
			nota = sc.nextDouble();

			if (nota > 10 || nota < 0) {
				System.out.println("Nota invalida!");
			}
		} while (nota < 0 || nota > 10.0);

		sc.close();

	}
}
