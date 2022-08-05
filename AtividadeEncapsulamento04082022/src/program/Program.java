package program;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Herois herois = new Herois();

		System.out.print("Entre com o universo a que pertence: ");
		String universoPertence = sc.toString();
		universoPertence.setUniversoPertence(universoPertence);

		System.out.print("Entre com o nome do heroi: ");
		int nomeDoHeroi = sc.nextInt();
		nomeDoHeroi.setnomeDoHeroi(nomeDoHeroi);

		System.out.print("Entre com o planeta natal: ");
		int planetaNatal = sc.nextInt();
		planetaNatal.setPlanetaNatal(planetaNatal);
		
		
		
		
		sc.close();

	}

}
