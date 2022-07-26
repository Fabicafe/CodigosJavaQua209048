package aulas;

import java.util.Locale;
import java.util.Scanner;

public class SalarioImpostos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * Peçpara o usuário inserir o valor do seu salario bruto e faça o desconto de
		 * 5% do IRPF, e 11 % do INSS e mostre o salario liquido. Se o salario liquido
		 * for menor que 1200,00 o profissional receberá 5% a mais de bônus, se o
		 * salario liquido ultrapassar 3500,00 o funcionario recebera 2% a mais de
		 * bônus.
		 */

		double salarioBruto = 0.00;
		double salarioLiquido = 0.00;
		double inss = 0.11;
		double irpf = 0.05;

		System.out.print("Entre com o salario bruto: R$");
		salarioBruto = sc.nextDouble();

		salarioLiquido = salarioBruto - ((salarioBruto * inss) + (salarioBruto * irpf));

		if (salarioLiquido < 1200.00) {
			salarioLiquido += salarioLiquido * 0.05;

		} else if (salarioLiquido > 3500.00) {
			salarioLiquido += salarioLiquido * 0.02;
		}

		salarioLiquido = salarioBruto - ((salarioBruto * 0.11) + (salarioBruto * 0.05));
		if (salarioLiquido < 1200.00) {
			salarioLiquido += salarioLiquido * 0.05;
		} else if (salarioLiquido > 3500.00) {
			salarioLiquido += salarioLiquido * 0.02;
		}
		System.out.print("Salario atualizado: " + salarioLiquido);

		sc.close();

	}
}