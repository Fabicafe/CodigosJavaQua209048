package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticosSalario {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double valorHora = 0;
		int quantidadeHoras = 0;
		double salario = 0;
		
		
		System.out.print("Entre com o valor da hora trabalhada: ");
		valorHora = leia.nextDouble();
		
		System.out.print("Entre com a quantidade de horas trabalhadas: ");
		quantidadeHoras = leia.nextInt();
		
		System.out.print("O valor do salario é: ");
		salario = leia.nextDouble();
		
		salario = valorHora * quantidadeHoras;
		
		System.out.println("O valor do salario é: " + salario);
		
	
		leia.close();

	}

}
