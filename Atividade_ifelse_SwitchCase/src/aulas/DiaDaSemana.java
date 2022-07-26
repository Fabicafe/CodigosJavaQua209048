package aulas;

import java.util.Locale;
import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int diaSemana = 0;

		System.out.println("Entre com o numero para saber o dia da semana: ");
		diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo!");
			break;

		case 2:
			System.out.println("Segunda!");
			break;
		case 3:
			System.out.println("Terça!");
			break;

		default:
			System.out.println("opção invalida!");
			break;
		}

		sc.close();
	}

}
