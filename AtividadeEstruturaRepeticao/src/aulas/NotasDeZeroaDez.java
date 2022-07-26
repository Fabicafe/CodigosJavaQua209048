package aulas;

import java.util.Locale;
import java.util.Scanner;

public class NotasDeZeroaDez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int nota = 0;

		while (nota != -1) {
			System.out.println("Digite a nota do aluno: ");
			nota = sc.nextInt();

			if (!(nota >= 0 && nota <= 10)) {
				System.out.println("Digite uma nota entre 0 e 10");
			}
		}

		sc.close();
		
	}
}