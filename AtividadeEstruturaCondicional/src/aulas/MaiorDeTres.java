package aulas;

import java.util.Locale;
import java.util.Scanner;

public class MaiorDeTres {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int valorA = 0;
		int valorB = 0;
		int valorC = 0;
		
		System.out.print("Entre com o valorA: ");
		valorA = sc.nextInt();
		
		System.out.print("Entre com o valorB: ");
		valorB = sc.nextInt();
		
		System.out.print("Entre com o valorC: ");
		valorC = sc.nextInt();
		
		System.out.print("O maior valor é: ");
		
		if(valorA > valorB && valorA > valorC){
			System.out.println(valorA);
			}
		else{
			System.out.println(valorB);
			
			System.out.println(valorC);
			}
		
		sc.close();
		
	}
}