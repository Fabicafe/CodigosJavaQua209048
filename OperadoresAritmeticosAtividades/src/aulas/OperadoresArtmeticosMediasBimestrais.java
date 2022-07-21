package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresArtmeticosMediasBimestrais {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
							
		System.out.print("Entre com a nota1: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Entre com a nota2: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Entre com a nota2: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Entre com a nota4: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 +nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media do aluno é: " + media);
		
		
			
		
		leia.close();
	}

}
