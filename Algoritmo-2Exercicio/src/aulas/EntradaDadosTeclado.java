package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int idade = 0;
		char sexo;
		double saldoConta  = 0.0;
		
		System.out.println("Entre com um nome da pessoa: ");
		nome = leia.nextLine();
		
		System.out.println("Entre com um numero inteiro: ");
		idade = leia.nextInt();
		
		System.out.println("Entre com o sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("Entre com o saldo: ");
		saldoConta = leia.nextDouble();
		
		System.out.println(nome + " tem " + idade + 
				" anos e seu sexo é " + sexo + ", e possui no banco R$" 
				+ saldoConta + " reais.");
		
			
		
		
		leia.close();

	}

}
