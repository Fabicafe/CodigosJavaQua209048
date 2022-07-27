package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ValidarInformacoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		String nome;
		int idade = 0;
		double salario = 0.0;
		char sexo;
		char estadoCivil;

		System.out.print("Entre com o nome: ");
		nome = sc.nextLine();

		while (nome.length() < 3) {
			System.out.println("Nome não pode conter menos que 3 caracteres!");

			System.out.print("Entre com o nome: ");
			nome = sc.nextLine();
		}

		System.out.print("Entre com a idade: ");
		idade = sc.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.println("Idade invalida entre com a idade novamente!");

			System.out.print("Entre com a idade: ");
			idade = sc.nextInt();
		}

		System.out.print("Entre com o salario: ");
		salario = sc.nextDouble();

		while (salario <= 0) {
			System.out.println("Salario invalido, não pode ser menor que 0.");

			System.out.print("Entre com o salario: ");
			salario = sc.nextDouble();

		}

		System.out.print("Entre com o sexo: ");
		sexo = sc.next().charAt(0);

		while (Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'F') {
			System.out.println("Entre com o sexo valido!");

			System.out.print("Entre com o sexo: ");
			sexo = sc.next().charAt(0);
		}

		System.out.print("Entre com o estado civil: ");
		estadoCivil = sc.next().charAt(0);

		while (Character.toUpperCase(estadoCivil) != 'S' && Character.toUpperCase(estadoCivil) != 'C'
				&& Character.toUpperCase(estadoCivil) != 'V' && Character.toUpperCase(estadoCivil) != 'D') {

			System.out.println("Estado civil invalido!");

			System.out.print("Entre com o estado civil: ");
			estadoCivil = sc.next().charAt(0);
		}

		sc.close();

	}
}
