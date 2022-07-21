package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresArtmeticosMediasBimestrais {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		int TotalDeBimestres = 4;
		double bimestre1 = 6.5;
		double bimestre2 = 8.0;
		double bimestre3 = 7.5;
		double bimestre4 = 8.5;
		double médiaFinal = 0.00;
					
		System.out.println("Entre com a médiafinal: ");
		médiaFinal = leia.nextDouble("A médiaFinal é a soma de + "
				+ "bimestre1" 
				+ "bimestre2"
				+ "bimestre3"
				+ "bimestre4")
				/ "TotalDeBimestres";
		
		
		
		
		
		
		leia.close();
	}

}
