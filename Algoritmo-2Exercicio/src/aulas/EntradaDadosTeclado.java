package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int numero = 0;
		char sexo;
		double x = 10.25;
		
		System.out.println("Entre o um nome: ");
		nome = leia.nextLine();
		
		System.out.println("Entre com um numero inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Entre com o sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("O mone digitado foi: " + nome);
		System.out.println("O numero digitado foi: " + numero);
		System.out.println("O sexo digitado foi: " + sexo);
		
		System.out.println("x está valendo: " + x);
		
		System.out.print("Insira um valor para a variavel x: ");
		x = leia.nextDouble();
		
		System.out.println("O valor de x agora está valendo: " + x);
		
		
		
		leia.close();

	}

}
