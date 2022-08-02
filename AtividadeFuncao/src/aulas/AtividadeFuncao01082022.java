package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeFuncao01082022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		/*1. Crie um programa para receber os dados de uma pessoa (altura, peso, idade e sexo),
		imprima na tela seu imc e se está dentro do peso ideal, sobrepeso ou abaixo do peso. */
		
		/*		
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
		System.out.println("Entre com o sexo: ");
		sexo = sc.next().charAt(0);

		System.out.printf("Luan tem %d e esta com o peso: %.2f", idade, peso);

		System.out.println(CalcularIMC(altura, peso));

		sc.close();
	}

	public static String CalcularIMC(double a, double p) {
		double imc = (p / (a * a));

		return "a pessoa esta com o peso: " + imc;
	}

}
*/


/*2. Crie um programa que receba o valor da gasolina e do álcool, e retorno para o usuário
 * qual está compensando mais utilizar;*/

/*
		String Alcool = JOptionPane.showInputDialog(null, "Informe o preço do Álcool");
String Gasolina = JOptionPane.showInputDialog(null, "Informe o preço do Gasolina");	

double pAlcool = Double.parseDouble(Alcool);
double pGasolina = Double.parseDouble(Gasolina);

double calculo = (pAlcool / pGasolina);

if (calculo >=0.70) {
	System.out.println(calculo + " - Gasolina é melhor!");
} else {
	System.out.println(calculo + " - Álcool é melhor!");


}
	}
	*/
		
	/*3. Crie um programa para calcular a formula do segundo grau, retorne valor de xI e xII;*/
		
		
	      System.out.println("Insira o valor de a:");
	        int a = in.nextInt();

	        System.out.println("Insira o valor de b:");
	        int b = in.nextInt();

	        System.out.println("Insira o valor de c:");
	        int c = in.nextInt();

	        double pB = Math.pow(b, 2);
	        double delta = pB - 4 * a * c;
	        double x1 = -1 * pB + Math.sqrt(delta) / 2 * a;
	        double x2 = -1 * pB - Math.sqrt(delta) / 2 * a;

	        double r1 = Math.round(x1);
	        double r2 = Math.round(x2);

	        System.out.println("A raíz x1 vale: "+ x1);
	        System.out.println("A raíz x2 vale: "+ x2);
	    }
	}











