package aulas;

import java.util.Locale;
import java.util.Scanner;

public class PesoAltura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * 1. Crie um programa para receber os dados de uma pessoa (altura, peso, idade
		 * e sexo), imprima na tela seu imc e se está dentro do peso ideal, sobrepeso ou
		 * abaixo do peso.
		 */
		
		double altura = 0.0;
		int idade = 0;
		double peso = 0.0;
		char sexo;

		System.out.print("Entre com a altura: ");
		altura = sc.nextDouble();
		System.out.print("Entre com a idade: ");
		idade = sc.nextInt();
		System.out.print("Entre com o peso: ");
		peso = sc.nextDouble();
		System.out.print("Entre com o sexo: ");
		sexo = sc.next().charAt(0);

		System.out.println(CalcularIMC(altura, peso, sexo));

		sc.close();
	}

	public static String CalcularIMC(double a, double p, char s) {
		double imc = (p / (a * a));

		if (Character.toUpperCase(s) == 'M' && imc < 20.7) {
			return "Abaixo do peso, imc: " + imc;

		} else if (Character.toUpperCase(s) == 'M' && imc >= 20.7 && imc < 26.4) {
			return "Peso normal, imc: " + imc;
		} else if (Character.toUpperCase(s) == 'M' && imc >= 26.4 && imc < 27.4) {
			return "Marginalmente acima do peso, imc: " + imc;
		} else if (Character.toUpperCase(s) == 'M' && imc >= 27.8 && imc < 31.1) {
			return "Acima do peso ideal, imc: " + imc;
		} else {
			return "Obeso, imc: " + imc;
		
		}
	}
	}