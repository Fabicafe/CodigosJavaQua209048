package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticosSalario {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double salárioHora = 16.00;
		double horasTrabalhadas = 160.00;
		
		
		System.out.println("Quanto o trabalhador recebe por hora: " + salárioHora);
		System.out.println("Quantas horas trabalhadas por mês: " + horasTrabalhadas);
		System.out.println("Qual o salário mensal do trabalhador: " + "R$" + (salárioHora * horasTrabalhadas));
		
		leia.close();

	}

}
