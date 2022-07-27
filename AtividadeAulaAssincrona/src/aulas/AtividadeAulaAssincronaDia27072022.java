package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeAulaAssincronaDia27072022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		
		int lulaMolusco = 0;
		int bolsoNelson = 0;
		int ciloucaGomes = 0;
		int boloBolinho = 0;
		int voto;
	
		
		
				
		System.out.print("Entre com 1 para o cadidato lulaMolusco, "
				+ "2 para o candidato bolsoNelson, "
				+ "3 para o candidatos ciloucaGomes, "
				+ "4 para o candidatos boloBolinho: ");
		
	
		if (lulaMolusco == 1) {
			voto = lulaMolusco + 1;
			System.out.println();
			
		}
		if (bolsoNelson == 2); { 
			voto = bolsoNelson + 1;
			System.out.println();
							
			if (ciloucaGomes == 3); 
			voto = ciloucaGomes + 1;
			System.out.println();
					
			if (boloBolinho == 4);
			voto = boloBolinho + 1;
			System.out.println();
			
		}
		
			
		System.out.println("O candidato LulaMolusco teve: " + "votos");
		lulaMolusco=sc.nextInt();
	
		System.out.println("O candidato bolsoNelson teve: " + "votos");
		bolsoNelson=sc.nextInt();
	
		System.out.println("O candidato ciloucaGomes teve: " + "votos");
		ciloucaGomes=sc.nextInt();
	
		System.out.println("O candidato boloBolinho teve: " + "votos");
		boloBolinho=sc.nextInt();
	

		sc.close();

	}
}