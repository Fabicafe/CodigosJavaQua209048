package program;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

import program.Herois;
import program.Viloes;


@SuppressWarnings("unused")

public class Program {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Herois herois = new Herois();
		
		System.out.print("Entre com o universo ao qual pertence: ");
		String universoPertence = sc.nextLine();
		herois.getUniversoPertence(universoPertence);
		
		System.out.print("Entre com o nome do heroi: ");
		int nomeDoHeroi = sc.nextInt();
		herois.getNomeDoHeroi(nomeDoHeroi);
		
		System.out.print("Entre com o planeta natal: ");
		int planetaNatal = sc.nextInt();
		herois.getPlanetaNatal(planetaNatal);
		
		System.out.print("Entre com a liga: ");
		int liga = sc.nextInt();
		herois. getLiga(liga);
		
		System.out.print("Entre com a base secreta: ");
		int baseSecreta = sc.nextInt();
		herois.getBaseSecreta(baseSecreta);
		
		System.out.print("Entre com os super poderes: ");
		int superPoderes = sc.nextInt();
		herois.getSuperPoderes(superPoderes);
		
		System.out.print("Entre com a idade: ");
		double idade = sc.nextDouble();
		herois.getIdade(idade);
		
		System.out.print("Esttá na ativa?: ");
		char estaNaAtiva = sc.nextLine();
		herois.getEstaNaAtiva(estaNaAtiva);
		
		
		
		Viloes viloes = new Viloes();
		
		System.out.print("Entre com o universo ao qual pertence: ");
		String galaxiaPertence = sc.nextLine();
		viloes.getGalaxiaPertence(galaxiaPertence);
		
		System.out.print("Entre com o nome do heroi: ");
		int nomeDoVilao = sc.nextInt();
		viloes.getNomeDoVilao(nomeDoVilao);
		
		System.out.print("Entre com o planeta natal: ");
		int planetaNatal = sc.nextInt();
		viloes.getPlanetaNatal(planetaNatal);
		
		System.out.print("Entre com a liga: ");
		int liga = sc.nextInt();
		viloes.getLiga(liga);
		
		System.out.print("Entre com a base secreta: ");
		int baseSecreta = sc.nextInt();
		viloes.getBaseSecreta(baseSecreta);
		
		System.out.print("Entre com os super poderes: ");
		int superPoderes = sc.nextInt();
		viloes .getSuperPoderes(superPoderes);
		
		System.out.print("Entre com a idade: ");
		double idade = sc.nextDouble();
		viloes.getIdade(idade);
		
		System.out.print("Esttá na ativa?: ");
		char estaNaAtiva = sc.nextLine();
		viloes.getEstaNaAtiva(estaNaAtiva);
		
			
		
		sc.close();

	}

}
