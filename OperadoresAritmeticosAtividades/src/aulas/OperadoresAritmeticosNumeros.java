package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
				
		int idade1 = 38;
		int idade2 = 46;
		int soma = 0;
		
		
		
		System.out.println("Entre com o numero para a soma: ");
		idade1 = leia.nextInt();
		
		System.out.println("Entre com o numero para a soma: ");
		idade2 = leia.nextInt();
		
		soma = idade1 + idade2;
		
		System.out.println(soma);
				
		
		leia.close();
		
		
		
		
	}

}
