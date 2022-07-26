package aulas;

import java.util.Locale;
import java.util.Scanner;

public class MaiorDeDois {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int valorA = 0;
		int valorB = 0;
		
		System.out.print("Entre com o valorA: ");
		valorA = sc.nextInt();
		
		System.out.print("Entre com o valorB: ");
		valorB = sc.nextInt();
		
				
		if(valorA > valorB){
			System.out.printf("Numero %d é o maior", valorA);
			}
		else{
			System.out.printf("Numero %d é o maior", valorB);
			}
         
		
		sc.close();
		
	}
}
		
		



